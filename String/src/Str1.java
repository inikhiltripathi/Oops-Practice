class Str1{
    public static void main(String[] args) {
        String name="Nikhil Tripathi";
        System.out.println(name.length());
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name.trim());
        System.out.println(name.substring(3,8));
        System.out.println(name.replace('i','e'));
        System.out.println(name.startsWith("N"));
        System.out.println(name.endsWith("l"));
        System.out.println(name.charAt(3));
        System.out.println(name.indexOf("T"));
        System.out.println(name.indexOf("khil"));
        System.out.println(name.indexOf("T",4));
        System.out.println(name.lastIndexOf('r'));
        System.out.println(name.equals("Nikhil Tripathi"));
    }
}
