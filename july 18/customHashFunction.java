public class customHashFunction {
    publiic static int simpleHashFunction(String input){
        int hashCode=0;
        for(int i =0;i<input.length();i++){
            hashCode+=input.charAt(i);

        }
        return hashCode;
    }
    public void main(){
        String name="madhu";
        int hashCode = simpleHashFunction(name);
        System.out.println(name);
        System.out.println(hashCode);
    }
    
}
