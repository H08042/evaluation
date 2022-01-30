package com.example.evaluationofdailymaintenance;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.evaluationofdailymaintenance.db.Bridge;
import com.example.evaluationofdailymaintenance.db.Culvert;
import com.example.evaluationofdailymaintenance.db.HighwayGreening;
import com.example.evaluationofdailymaintenance.db.HighwayPatrol;
import com.example.evaluationofdailymaintenance.db.InformationSubmission;
import com.example.evaluationofdailymaintenance.db.MaintenanceAndSafetyProduction;
import com.example.evaluationofdailymaintenance.db.MaintenanceMachineryAndEquipmentManagement;
import com.example.evaluationofdailymaintenance.db.OfficeManagement;
import com.example.evaluationofdailymaintenance.db.Pavement;
import com.example.evaluationofdailymaintenance.db.RegularInspectionOfBridges;
import com.example.evaluationofdailymaintenance.db.RegularInspectionOfCulvert;
import com.example.evaluationofdailymaintenance.db.RegularInspectionOfTunnel;
import com.example.evaluationofdailymaintenance.db.StaffTechnicalTraining;
import com.example.evaluationofdailymaintenance.db.StationManagement;
import com.example.evaluationofdailymaintenance.db.Subgrade;
import com.example.evaluationofdailymaintenance.db.SuperviseProblemRectification;
import com.example.evaluationofdailymaintenance.db.SystemConstruction;
import com.example.evaluationofdailymaintenance.db.TrafficEngineeringAndFacilitiesAlongTheLine;
import com.example.evaluationofdailymaintenance.db.TrafficInvestigation;
import com.example.evaluationofdailymaintenance.db.Tunnel;

import org.litepal.LitePal;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LitePal.getDatabase();
        setContentView(R.layout.activity_main);
        

    }
}