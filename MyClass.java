import java.util.Scanner;
class karyawan{
    
    public String GetNama(String nama){
        return nama;
    }
    public String GetAlamat(String alamat){
        return alamat;
    }
    
    public String getJabat(String jabat){
        return jabat;
    }
    // Overloading
    public String GetInfo(String pd){
        return pd;
    }
    public int GetInfo(int lb){
        return lb;
    }
    
}

class Pendidikan extends karyawan{
    @Override
    public String GetInfo(String pd){
        return pd;
    }
}

class jabatan extends karyawan{
    int gajiP, tunjangan, lmbr;
    @Override
    public String getJabat(String jabat) {
        return jabat;
    }
    public int GetGajiPokok(String jabat){
        if(jabat.equals("Ketua") || jabat.equals("ketua")){
            gajiP = 200;
            return gajiP;
        }else if(jabat.equals("wakil") || jabat.equals("wakil") ){
            gajiP = 150;
            return gajiP;
        }else if(jabat.equals("pegawai")){
            gajiP = 100;
            return gajiP;
        }
        return 0;
    }
    public int GetTunjangan(String jabat){
        if(jabat.equals("Ketua") || jabat.equals("ketua") ){
            tunjangan = 500;
            return tunjangan;
        }else if(jabat.equals("Wakil") || jabat.equals("wakil")){
            tunjangan = 450;
            return tunjangan;
        }else if(jabat.equals("Pegawai") || jabat.equals("pegawai") ){
            tunjangan = 300;
            return tunjangan;
        }
        return 0;
    }
    
    public int GetLembur(String jabat){
        if(jabat.equals("Ketua")|| jabat.equals("ketua")){
            lmbr = 150;
            return lmbr;
        }else if(jabat.equals("Wakil") || jabat.equals("wakil")){
            lmbr = 100;
            return lmbr;
        }else if(jabat.equals("Pegawai") || jabat.equals("pegawai")){
            lmbr = 50;
            return lmbr;
        }
        return 0;
    }
}

class penggajian{
    // Overloading
    public int GetTotal(int gl, int lembur){
        return gl*lembur;
    }
    
    public double GetTotal(double gp, double gt, double gl){
        return gp+gt+gl;
    }
    
}
class MyClass {
    public static void main(String args[]) {
        karyawan nm = new karyawan();
        Pendidikan pd = new Pendidikan();
        jabatan jb = new jabatan();
        penggajian gaji = new penggajian();
        Scanner key = new Scanner(System.in);
        String name, alamat, jabatan, dik;
        int lembur;
        System.out.print("Masukkan nama: ");
        name = key.nextLine();
        System.out.print("Masukkan alamat: ");
        alamat = key.nextLine();
        System.out.print("Masukkan jabatan: ");
        jabatan = key.nextLine();
        System.out.print("Masukkan Status Pd: ");
        dik = key.nextLine();
        System.out.print("Masukkan jml lembur: ");
        lembur = key.nextInt();
        key.close();
        System.out.print("=========================================="+ "\n");
        
        System.out.println("Nama: " + nm.GetNama(name) + "\n");
        
        System.out.println("Alamat: " +nm.GetAlamat(alamat)+ "\n");
        
        System.out.println("jabatan: " +jb.getJabat(jabatan)+ "\n");
        
        System.out.println("Status Pd: " +pd.GetInfo(nm.GetInfo(dik))+ "\n");
        
        System.out.println("Jumlah lembur: " +lembur+ "\n");
        
        System.out.println("Gaji Pokok: " + jb.GetGajiPokok(jabatan)+ "\n");
        
        System.out.println("Tunjangan: " + jb.GetTunjangan(jabatan)+ "\n");
        
        System.out.println("Lembur: " + gaji.GetTotal(jb.GetLembur(jabatan), lembur)+ "\n");
        
        System.out.println("Total Gaji: " + gaji.GetTotal(jb.GetGajiPokok(jabatan), jb.GetTunjangan(jabatan), gaji.GetTotal(jb.GetLembur(jabatan), lembur) )+ "\n");
    }
}