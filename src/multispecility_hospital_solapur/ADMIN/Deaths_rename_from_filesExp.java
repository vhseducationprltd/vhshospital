package multispecility_hospital_solapur.ADMIN;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author heman
 */
@Entity
@Table(name = "deaths", catalog = "VHSHOSPITAL", schema = "")
@NamedQueries({
    @NamedQuery(name = "Deaths.findAll", query = "SELECT d FROM Deaths d")
    , @NamedQuery(name = "Deaths.findBySr", query = "SELECT d FROM Deaths d WHERE d.sr = :sr")
    , @NamedQuery(name = "Deaths.findByPid", query = "SELECT d FROM Deaths d WHERE d.pid = :pid")
    , @NamedQuery(name = "Deaths.findByPatientname", query = "SELECT d FROM Deaths d WHERE d.patientname = :patientname")
    , @NamedQuery(name = "Deaths.findByAdmitdate", query = "SELECT d FROM Deaths d WHERE d.admitdate = :admitdate")
    , @NamedQuery(name = "Deaths.findByDischargedate", query = "SELECT d FROM Deaths d WHERE d.dischargedate = :dischargedate")
    , @NamedQuery(name = "Deaths.findByNodays", query = "SELECT d FROM Deaths d WHERE d.nodays = :nodays")
    , @NamedQuery(name = "Deaths.findByDrname", query = "SELECT d FROM Deaths d WHERE d.drname = :drname")
    , @NamedQuery(name = "Deaths.findByWardname", query = "SELECT d FROM Deaths d WHERE d.wardname = :wardname")
    , @NamedQuery(name = "Deaths.findByWardcharges", query = "SELECT d FROM Deaths d WHERE d.wardcharges = :wardcharges")
    , @NamedQuery(name = "Deaths.findByOperatioinamt", query = "SELECT d FROM Deaths d WHERE d.operatioinamt = :operatioinamt")
    , @NamedQuery(name = "Deaths.findByExtraamt", query = "SELECT d FROM Deaths d WHERE d.extraamt = :extraamt")
    , @NamedQuery(name = "Deaths.findByTotalamount", query = "SELECT d FROM Deaths d WHERE d.totalamount = :totalamount")
    , @NamedQuery(name = "Deaths.findByDeathreason", query = "SELECT d FROM Deaths d WHERE d.deathreason = :deathreason")
    , @NamedQuery(name = "Deaths.findByDeathtime", query = "SELECT d FROM Deaths d WHERE d.deathtime = :deathtime")
    , @NamedQuery(name = "Deaths.findByDate", query = "SELECT d FROM Deaths d WHERE d.date = :date")
    , @NamedQuery(name = "Deaths.findByTime", query = "SELECT d FROM Deaths d WHERE d.time = :time")})
public class Deaths_rename_from_filesExp implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "SR")
    private Integer sr;
    @Basic(optional = false)
    @Column(name = "PID")
    private long pid;
    @Basic(optional = false)
    @Column(name = "PATIENTNAME")
    private String patientname;
    @Basic(optional = false)
    @Column(name = "ADMITDATE")
    private String admitdate;
    @Basic(optional = false)
    @Column(name = "DISCHARGEDATE")
    private String dischargedate;
    @Basic(optional = false)
    @Column(name = "NODAYS")
    private int nodays;
    @Basic(optional = false)
    @Column(name = "DRNAME")
    private String drname;
    @Basic(optional = false)
    @Column(name = "WARDNAME")
    private String wardname;
    @Basic(optional = false)
    @Column(name = "WARDCHARGES")
    private int wardcharges;
    @Basic(optional = false)
    @Column(name = "OPERATIOINAMT")
    private int operatioinamt;
    @Basic(optional = false)
    @Column(name = "EXTRAAMT")
    private int extraamt;
    @Basic(optional = false)
    @Column(name = "TOTALAMOUNT")
    private int totalamount;
    @Basic(optional = false)
    @Column(name = "DEATHREASON")
    private String deathreason;
    @Basic(optional = false)
    @Column(name = "DEATHTIME")
    private String deathtime;
    @Basic(optional = false)
    @Column(name = "DATE")
    private String date;
    @Basic(optional = false)
    @Column(name = "TIME")
    private String time;
 
    public Deaths_rename_from_filesExp(Integer sr) {
        this.sr = sr;
    }

    public Deaths_rename_from_filesExp(Integer sr, long pid, String patientname, String admitdate, String dischargedate, int nodays, String drname, String wardname, int wardcharges, int operatioinamt, int extraamt, int totalamount, String deathreason, String deathtime, String date, String time) {
        this.sr = sr;
        this.pid = pid;
        this.patientname = patientname;
        this.admitdate = admitdate;
        this.dischargedate = dischargedate;
        this.nodays = nodays;
        this.drname = drname;
        this.wardname = wardname;
        this.wardcharges = wardcharges;
        this.operatioinamt = operatioinamt;
        this.extraamt = extraamt;
        this.totalamount = totalamount;
        this.deathreason = deathreason;
        this.deathtime = deathtime;
        this.date = date;
        this.time = time;
    }

    public Integer getSr() {
        return sr;
    }

    public void setSr(Integer sr) {
        Integer oldSr = this.sr;
        this.sr = sr;
        changeSupport.firePropertyChange("sr", oldSr, sr);
    }

    public long getPid() {
        return pid;
    }

    public void setPid(long pid) {
        long oldPid = this.pid;
        this.pid = pid;
        changeSupport.firePropertyChange("pid", oldPid, pid);
    }

    public String getPatientname() {
        return patientname;
    }

    public void setPatientname(String patientname) {
        String oldPatientname = this.patientname;
        this.patientname = patientname;
        changeSupport.firePropertyChange("patientname", oldPatientname, patientname);
    }

    public String getAdmitdate() {
        return admitdate;
    }

    public void setAdmitdate(String admitdate) {
        String oldAdmitdate = this.admitdate;
        this.admitdate = admitdate;
        changeSupport.firePropertyChange("admitdate", oldAdmitdate, admitdate);
    }

    public String getDischargedate() {
        return dischargedate;
    }

    public void setDischargedate(String dischargedate) {
        String oldDischargedate = this.dischargedate;
        this.dischargedate = dischargedate;
        changeSupport.firePropertyChange("dischargedate", oldDischargedate, dischargedate);
    }

    public int getNodays() {
        return nodays;
    }

    public void setNodays(int nodays) {
        int oldNodays = this.nodays;
        this.nodays = nodays;
        changeSupport.firePropertyChange("nodays", oldNodays, nodays);
    }

    public String getDrname() {
        return drname;
    }

    public void setDrname(String drname) {
        String oldDrname = this.drname;
        this.drname = drname;
        changeSupport.firePropertyChange("drname", oldDrname, drname);
    }

    public String getWardname() {
        return wardname;
    }

    public void setWardname(String wardname) {
        String oldWardname = this.wardname;
        this.wardname = wardname;
        changeSupport.firePropertyChange("wardname", oldWardname, wardname);
    }

    public int getWardcharges() {
        return wardcharges;
    }

    public void setWardcharges(int wardcharges) {
        int oldWardcharges = this.wardcharges;
        this.wardcharges = wardcharges;
        changeSupport.firePropertyChange("wardcharges", oldWardcharges, wardcharges);
    }

    public int getOperatioinamt() {
        return operatioinamt;
    }

    public void setOperatioinamt(int operatioinamt) {
        int oldOperatioinamt = this.operatioinamt;
        this.operatioinamt = operatioinamt;
        changeSupport.firePropertyChange("operatioinamt", oldOperatioinamt, operatioinamt);
    }

    public int getExtraamt() {
        return extraamt;
    }

    public void setExtraamt(int extraamt) {
        int oldExtraamt = this.extraamt;
        this.extraamt = extraamt;
        changeSupport.firePropertyChange("extraamt", oldExtraamt, extraamt);
    }

    public int getTotalamount() {
        return totalamount;
    }

    public void setTotalamount(int totalamount) {
        int oldTotalamount = this.totalamount;
        this.totalamount = totalamount;
        changeSupport.firePropertyChange("totalamount", oldTotalamount, totalamount);
    }

    public String getDeathreason() {
        return deathreason;
    }

    public void setDeathreason(String deathreason) {
        String oldDeathreason = this.deathreason;
        this.deathreason = deathreason;
        changeSupport.firePropertyChange("deathreason", oldDeathreason, deathreason);
    }

    public String getDeathtime() {
        return deathtime;
    }

    public void setDeathtime(String deathtime) {
        String oldDeathtime = this.deathtime;
        this.deathtime = deathtime;
        changeSupport.firePropertyChange("deathtime", oldDeathtime, deathtime);
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        String oldDate = this.date;
        this.date = date;
        changeSupport.firePropertyChange("date", oldDate, date);
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        String oldTime = this.time;
        this.time = time;
        changeSupport.firePropertyChange("time", oldTime, time);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (sr != null ? sr.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Deaths_rename_from_filesExp)) {
            return false;
        }
        Deaths_rename_from_filesExp other = (Deaths_rename_from_filesExp) object;
        if ((this.sr == null && other.sr != null) || (this.sr != null && !this.sr.equals(other.sr))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "multispecility_hospital_solapur.ADMIN.Deaths[ sr=" + sr + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
