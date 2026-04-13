class Evaluator {
    public String evaluate(Node root) {
        if (root.left == null && root.right == null) {
            return root.value;
        }

        String left = evaluate(root.left);
        String right = evaluate(root.right);

        try {
            double l = Double.parseDouble(left);
            double r = Double.parseDouble(right);

            switch (root.value) {
                case "+": return String.valueOf(l + r);
                case "-": return String.valueOf(l - r);
                case "*": return String.valueOf(l * r);
                case "/": return String.valueOf(l / r);
                case "^": return String.valueOf(Math.pow(l, r));
            }
        } catch (NumberFormatException e) {
            
        }

        return "(" + left + " " + root.value + " " + right + ")";
    }
}
