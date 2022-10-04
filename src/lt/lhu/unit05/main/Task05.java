package lt.lhu.unit05.main;

public class Task05 {

	public static void main(String[] args) {
        String s = "4656565655165465465168";
        String k = "565463165421654564649525256";
        String sum = "";
        
        int i = 0;
        int i2 = 0;
        
        while (i < args.length){
            s = add(s, args[i]);
            k = add(k, args[i2]);
            i++;
        }
        
        sum = s + k;
        
        System.out.println(sum);
    }
////////////////////////////////////////////////////////////////////    
    public static String add(String a, String b) {
        if (a.length() != b.length()) {
            if (a.length() > b.length()) {
                for (int j=a.length() - b.length();j > 0;j--){
                    b = 0 + b;
                }
            }else{
                for (int j=b.length() - a.length();j > 0;j--){
                    a = 0 + a;
                }
            }
        }
        char[] aa=reverse(a).toCharArray();
        char[] bb=reverse(b).toCharArray();
        
        int i = 0;
        
        String t = " ";
        
        int m = 0;
        
        while (i < aa.length) {
            int x = (Integer.parseInt(aa[i] + " ") + Integer.parseInt(bb[i] + " ") + m);
            
            String p = x + " ";
            
            if (p.length() > 1 && i < aa.length - 1) {
                x = Integer.parseInt(p.toCharArray()[1] + " ");
                m = Integer.parseInt(p.toCharArray()[0] + " ");
                }else{
                	m = 0;
            }
            t = x + t;
            i++;
        }
        return t;
    }
///////////////////////////////////////////////////////////
    public static String reverse(String s) {
        String t = " ";
        
        int j = s.length() - 1;
        
        for (int i = 0;i < s.length();i++) {
            t += s.charAt(j);
            j--;
        }
        return t;
    }
///////////////////////////////////////////////////////////    
    public static String mov(String a, String b) {
        return (Integer.parseInt(a) - Integer.parseInt(b)) + " ";
    }
    
}
