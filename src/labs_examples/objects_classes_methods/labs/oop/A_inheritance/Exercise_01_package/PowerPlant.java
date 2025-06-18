package labs_examples.objects_classes_methods.labs.oop.A_inheritance.Exercise_01_package;

public class PowerPlant {

    int turbinenum;
    double totaloutput;
    int personnel;
    double acreage;
    int totalcost;
    int buildcost;

    public PowerPlant(int turbinenum, double totaloutput, int personnel, double acreage, int totalcost, int buildcost) {
        this.turbinenum = turbinenum;
        this.totaloutput = totaloutput;
        this.personnel = personnel;
        this.acreage = acreage;
        this.totalcost = totalcost;
        this.buildcost = buildcost;
    }

    public int getTurbinenum() {
        return turbinenum;
    }

    public void setTurbinenum(int turbinenum) {
        this.turbinenum = turbinenum;
    }

    public double getTotaloutput() {
        return totaloutput;
    }

    public void setTotaloutput(double totaloutput) {
        this.totaloutput = totaloutput;
    }

    public int getPersonnel() {
        return personnel;
    }

    public void setPersonnel(int personnel) {
        this.personnel = personnel;
    }

    public double getAcreage() {
        return acreage;
    }

    public void setAcreage(double acreage) {
        this.acreage = acreage;
    }

    public int getTotalcost() {
        return totalcost;
    }

    public void setTotalcost(int totalcost) {
        this.totalcost = totalcost;
    }

    public int getBuildcost() {
        return buildcost;
    }

    public void setBuildcost(int buildcost) {
        this.buildcost = buildcost;
    }

    @Override
    public String toString() {
        return "PowerPlant{" +
                "turbinenum=" + turbinenum +
                ", totaloutput=" + totaloutput +
                ", personnel=" + personnel +
                ", acreage=" + acreage +
                ", totalcost=" + totalcost +
                ", buildcost=" + buildcost +
                '}';
    }

}
