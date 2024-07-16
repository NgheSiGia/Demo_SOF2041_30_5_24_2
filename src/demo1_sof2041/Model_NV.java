package demo1_sof2041;

public class Model_NV {
    private String maNv;
    private String pass;
    private String ten;
    private boolean vaiTro; 

    public Model_NV() {
    }

    public Model_NV(String maNv, String pass, String ten, boolean vaiTro) {
        this.maNv = maNv;
        this.pass = pass;
        this.ten = ten;
        this.vaiTro = vaiTro;
    }

    public String getMaNv() {
        return maNv;
    }

    public void setMaNv(String maNv) {
        this.maNv = maNv;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public boolean getVaiTro() {
        return vaiTro;
    }

    public void setVaiTro(boolean vaiTro) {
        this.vaiTro = vaiTro;
    }
    
    public Object[] toDataRow(){
        return new Object[]{this.getMaNv(), this.getPass(), this.getTen(), this.getVaiTro()?"Trưởng phòng":"Nhân viên"};
    }
}
