// Last updated: 13/08/2026, 15:50:02
class Solution {
    public String countOfAtoms(String formula) {
        TreeMap<String, Integer> map = new TreeMap<>();
        Stack<Map<String, Integer>> stack = new Stack<>();

        stack.push(new HashMap<>());
        int i = 0;

        while (i < formula.length()) {
            char ch = formula.charAt(i);

            if (ch == '(') {
                stack.push(new HashMap<>());
                i++;
            } 
            else if (ch == ')') {
                i++;

                int num = 0;
                while (i < formula.length() && Character.isDigit(formula.charAt(i))) {
                    num = num * 10 + (formula.charAt(i) - '0');
                    i++;
                }

                if (num == 0) num = 1;

                Map<String, Integer> top = stack.pop();
                for (String atom : top.keySet()) {
                    stack.peek().put(
                        atom,
                        stack.peek().getOrDefault(atom, 0) + top.get(atom) * num
                    );
                }
            } 
            else {
                StringBuilder atom = new StringBuilder();
                atom.append(ch);
                i++;

                while (i < formula.length() && Character.isLowerCase(formula.charAt(i))) {
                    atom.append(formula.charAt(i));
                    i++;
                }

                int num = 0;
                while (i < formula.length() && Character.isDigit(formula.charAt(i))) {
                    num = num * 10 + (formula.charAt(i) - '0');
                    i++;
                }

                if (num == 0) num = 1;

                Map<String, Integer> current = stack.peek();
                current.put(
                    atom.toString(),
                    current.getOrDefault(atom.toString(), 0) + num
                );
            }
        }

        map.putAll(stack.pop());

        StringBuilder result = new StringBuilder();

        for (String atom : map.keySet()) {
            result.append(atom);

            if (map.get(atom) > 1) {
                result.append(map.get(atom));
            }
        }

        return result.toString();
    }
}