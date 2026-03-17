<<<<<<< feature/nested-lambda-lab
package org.example.pract5;

public abstract class ReportGenerator {

    public final void generate() {
        loadData();
        processData();
        exportData();
    }

    abstract void exportData();
    abstract void processData();

    private void loadData() {
        System.out.println("load data");
    }


}
=======
package org.example.pract5;

public abstract class ReportGenerator {

    public final void generate() {
        loadData();
        processData();
        exportData();
    }

    abstract void exportData();
    abstract void processData();

    private void loadData() {
        System.out.println("load data");
    }


}
>>>>>>> master
