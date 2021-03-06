package com.nisith.currencyandotherconverters;

public class VolumeConverter {

    private final int literId = 1, milliLiterId = 2,cubicMeterId = 3,cubicCentiMeterId = 4,cubickilometerId = 5,
            cubicMilliMeterId = 6, cubicFootId = 7,cubicInchId = 8,USLiquidGallonId = 9,USLiquidQuartId =10,USLiquidPintId =11,USLegalCupId =12,
            USFluidOunceId = 13, USTableSpoonId = 14, USTeaSpoonId = 15,imperialGallonId = 16,imperialQuartId = 17,imperialPintId = 18,
            imperialCupId = 19,imperialFluidOunceId = 20,imperialTableSpoonId = 21,imperialTeaSpoonId =22;



    private int getUnitId(String unitName) {
        int idValue = 0;
        if (unitName.equalsIgnoreCase("liter")) {
            idValue = literId;

        } else if (unitName.equalsIgnoreCase("milliLiter")) {
            idValue = milliLiterId;

        } else if (unitName.equalsIgnoreCase("cubic Meter")) {
            idValue = cubicMeterId;

        } else if (unitName.equalsIgnoreCase("cubic CentiMeter" )) {
            idValue = cubicCentiMeterId;

        } else if (unitName.equalsIgnoreCase("cubic kilometer")) {
            idValue = cubickilometerId;

        } else if (unitName.equalsIgnoreCase("cubic MilliMeter")) {
            idValue = cubicMilliMeterId;

        } else if (unitName.equalsIgnoreCase("cubic Foot")) {
            idValue = cubicFootId;

        } else if (unitName.equalsIgnoreCase("cubic Inch")) {
            idValue = cubicInchId;

        } else if (unitName.equalsIgnoreCase("US liquid gallon")) {
            idValue = USLiquidGallonId;

        }else if (unitName.equalsIgnoreCase("US liquid quart")) {
            idValue = USLiquidQuartId;

        }else if (unitName.equalsIgnoreCase("US liquid pint")) {
            idValue = USLiquidPintId;

        }else if (unitName.equalsIgnoreCase("US cup")) {
            idValue = USLegalCupId;

        }else if (unitName.equalsIgnoreCase("US fluid ounce")) {
            idValue = USFluidOunceId;

        }else if (unitName.equalsIgnoreCase("US tableSpoon")) {
            idValue = USTableSpoonId;

        }else if (unitName.equalsIgnoreCase("US teaSpoon")) {
            idValue = USTeaSpoonId;

        }else if (unitName.equalsIgnoreCase("imperial gallon (UK)")) {
            idValue = imperialGallonId;

        }else if (unitName.equalsIgnoreCase("imperial quart (UK)")) {
            idValue = imperialQuartId;

        }else if (unitName.equalsIgnoreCase("imperial pint (UK)")) {
            idValue = imperialPintId;

        }else if (unitName.equalsIgnoreCase("imperial cup (UK)")) {
            idValue = imperialCupId;

        }else if (unitName.equalsIgnoreCase("imperial fluid ounce (UK)")) {
            idValue = imperialFluidOunceId;

        }else if (unitName.equalsIgnoreCase("imperial tableSpoon (UK)")) {
            idValue = imperialTableSpoonId;

        }else if (unitName.equalsIgnoreCase("imperial teaSpoon (UK)")){
            idValue = imperialTeaSpoonId;
        }

        return idValue;
    }








    public double getVolumeConvertResult(String sourceUnit,String destUnit,double value ){

        double result=0;

        if (sourceUnit.equalsIgnoreCase("liter")) {
            result = literToOthers(sourceUnit,destUnit,value);

        } else if (sourceUnit.equalsIgnoreCase("milliLiter")) {
            result = milliLiterToOthers(sourceUnit,destUnit,value);

        } else if (sourceUnit.equalsIgnoreCase("cubic Meter")) {
            result = cubicMeterToOthers(sourceUnit,destUnit,value);

        } else if (sourceUnit.equalsIgnoreCase("cubic CentiMeter" )) {
            result = cubicCentiMeterToOthers(sourceUnit,destUnit,value);

        } else if (sourceUnit.equalsIgnoreCase("cubic kilometer")) {
            result = cubickilometerToOthers(sourceUnit,destUnit,value);

        } else if (sourceUnit.equalsIgnoreCase("cubic MilliMeter")) {
            result = cubicMilliMeterToOthers(sourceUnit,destUnit,value);

        } else if (sourceUnit.equalsIgnoreCase("cubic Foot")) {
            result = cubicFootToOthers(sourceUnit,destUnit,value);

        } else if (sourceUnit.equalsIgnoreCase("cubic Inch")) {
            result = cubicInchToOthers(sourceUnit,destUnit,value);

        } else if (sourceUnit.equalsIgnoreCase("US liquid gallon")) {
            result = USLiquidGallonToOthers(sourceUnit,destUnit,value);

        }else if (sourceUnit.equalsIgnoreCase("US liquid quart")) {
            result = USLiquidQuartToOthers(sourceUnit,destUnit,value);

        }else if (sourceUnit.equalsIgnoreCase("US liquid pint")) {
            result = USLiquidPintToOthers(sourceUnit,destUnit,value);

        }else if (sourceUnit.equalsIgnoreCase("US cup")) {
            result = USLegalCupToOthers(sourceUnit,destUnit,value);

        }else if (sourceUnit.equalsIgnoreCase("US fluid ounce")) {
            result = USFluidOunceToOthers(sourceUnit,destUnit,value);

        }else if (sourceUnit.equalsIgnoreCase("US tableSpoon")) {
            result = USTableSpoonToOthers(sourceUnit,destUnit,value);

        }else if (sourceUnit.equalsIgnoreCase("US teaSpoon")) {
            result = USTeaSpoonToOthers(sourceUnit,destUnit,value);

        }else if (sourceUnit.equalsIgnoreCase("imperial gallon (UK)")) {
            result = imperialGallonToOthers(sourceUnit,destUnit,value);

        }else if (sourceUnit.equalsIgnoreCase("imperial quart (UK)")) {
            result = imperialQuartToOthers(sourceUnit,destUnit,value);

        }else if (sourceUnit.equalsIgnoreCase("imperial pint (UK)")) {
            result = imperialPintToOthers(sourceUnit,destUnit,value);

        }else if (sourceUnit.equalsIgnoreCase("imperial cup (UK)")) {
            result = imperialCupToOthers(sourceUnit,destUnit,value);

        }else if (sourceUnit.equalsIgnoreCase("imperial fluid ounce (UK)")) {
            result = imperialFluidOunceToOthers(sourceUnit,destUnit,value);

        }else if (sourceUnit.equalsIgnoreCase("imperial tableSpoon (UK)")) {
            result = imperialTableSpoonToOthers(sourceUnit,destUnit,value);

        }else if (sourceUnit.equalsIgnoreCase("imperial teaSpoon (UK)")){
            result = imperialTeaSpoonToOthers(sourceUnit,destUnit,value);
        }


        return result;

    }






    private double literToOthers(String sourceUnit,String destUnit,double value){
        double result=0;
        switch (getUnitId(destUnit)){

            case literId:
                result = value;
                break;

            case milliLiterId:
                result = value*1000;
                break;
            case cubicMeterId:
                result = value*0.001;
                break;
            case cubicCentiMeterId:
                result = value*1000;
                break;
            case cubickilometerId:
                result = value*Math.pow(10,-12);
                break;

            case cubicMilliMeterId:
                result = value*1000000;
                break;
            case cubicFootId:
                result = value*0.0353146667;
                break;

            case cubicInchId:
                result = value*61.023744095;
                break;

            case USLiquidGallonId:
                result = value*0.2641720524;
                break;
            case USLiquidQuartId:
                result = value*1.0566882094;
                break;

            case USLiquidPintId:
                result = value*2.1133764189;
                break;

            case USLegalCupId:
                result = value*4.166666;
                break;

            case USFluidOunceId:
                result = value*33.814022702;
                break;
            case USTableSpoonId:
                result = value*67.628045404;
                break;
            case USTeaSpoonId:
                result = value*202.88413621;
                break;

            case imperialGallonId:
                result = value*0.2199692483;
                break;
            case imperialQuartId:
                result = value*0.8798769932;
                break;

            case imperialPintId:
                result = value*1.7597539864;
                break;

            case imperialCupId:
                result = value*3.5195079728;
                break;
            case imperialFluidOunceId:
                result = value*35.195079728;
                break;

            case imperialTableSpoonId:
                result = value*56.312127565;
                break;

            case imperialTeaSpoonId:
                result = value*168.93638269;
                break;
        }

        return result;
    }





    private double milliLiterToOthers(String sourceUnit,String destUnit,double value){
        double result=0;
        switch (getUnitId(destUnit)){

            case literId:
                result = value*0.001;
                break;

            case milliLiterId:
                result = value;
                break;
            case cubicMeterId:
                result = value*Math.pow(10,-6);
                break;
            case cubicCentiMeterId:
                result = value;
                break;
            case cubickilometerId:
                result = value*Math.pow(10,-15);
                break;

            case cubicMilliMeterId:
                result = value*1000;
                break;
            case cubicFootId:
                result = value*0.0000353147;
                break;

            case cubicInchId:
                result = value*0.0610237441;
                break;

            case USLiquidGallonId:
                result = value*0.0002641721;
                break;
            case USLiquidQuartId:
                result = value*0.0010566882;
                break;

            case USLiquidPintId:
                result = value*0.0021133764;
                break;

            case USLegalCupId:
                result = value/240;
                break;

            case USFluidOunceId:
                result = value*0.0338140227;
                break;
            case USTableSpoonId:
                result = value*0.0676280454;
                break;
            case USTeaSpoonId:
                result = value*0.2028841362;
                break;

            case imperialGallonId:
                result = value*0.0002199692;
                break;
            case imperialQuartId:
                result = value*0.000879877;
                break;

            case imperialPintId:
                result = value*0.001759754;
                break;

            case imperialCupId:
                result = value*0.003519508;
                break;
            case imperialFluidOunceId:
                result = value*0.0351950797;
                break;

            case imperialTableSpoonId:
                result = value*0.0563121276;
                break;

            case imperialTeaSpoonId:
                result = value*0.1689363827;
                break;
        }

        return result;
    }




    private double cubicMeterToOthers(String sourceUnit,String destUnit,double value){
        double result=0;
        switch (getUnitId(destUnit)){

            case literId:
                result = value*1000;
                break;

            case milliLiterId:
                result = value*Math.pow(10,6);
                break;
            case cubicMeterId:
                result = value;
                break;
            case cubicCentiMeterId:
                result = value*1000000;
                break;
            case cubickilometerId:
                result = value*Math.pow(10,-9);
                break;

            case cubicMilliMeterId:
                result = value*Math.pow(10,9);
                break;
            case cubicFootId:
                result = value*35.314666721;
                break;

            case cubicInchId:
                result = value*61023.744095;
                break;

            case USLiquidGallonId:
                result = value*264.17205236;
                break;
            case USLiquidQuartId:
                result = value*1056.6882094;
                break;

            case USLiquidPintId:
                result = value*2113.3764189;
                break;

            case USLegalCupId:
                result = value*4226.7528377;
                break;

            case USFluidOunceId:
                result = value*33814.022702;
                break;
            case USTableSpoonId:
                result = value*67628.045404;
                break;
            case USTeaSpoonId:
                result = value*202884.13621;
                break;

            case imperialGallonId:
                result = value*219.9692483;
                break;
            case imperialQuartId:
                result = value*879.8769932;
                break;

            case imperialPintId:
                result = value*1759.7539864;
                break;

            case imperialCupId:
                result = value*3519.5079728;
                break;
            case imperialFluidOunceId:
                result = value*35195.079728;
                break;

            case imperialTableSpoonId:
                result = value*56312.127565;
                break;

            case imperialTeaSpoonId:
                result = value*168936.38269;
                break;
        }

        return result;
    }





    private double cubicCentiMeterToOthers(String sourceUnit,String destUnit,double value){
        double result=0;
        switch (getUnitId(destUnit)){

            case literId:
                result = value*0.001;
                break;

            case milliLiterId:
                result = value;
                break;
            case cubicMeterId:
                result = value*Math.pow(10,-6);
                break;
            case cubicCentiMeterId:
                result = value;
                break;
            case cubickilometerId:
                result = value*Math.pow(10,-15);
                break;

            case cubicMilliMeterId:
                result = value*1000;
                break;
            case cubicFootId:
                result = value*0.0000353147;
                break;

            case cubicInchId:
                result = value*0.0610237441;
                break;

            case USLiquidGallonId:
                result = value*0.0002641721;
                break;
            case USLiquidQuartId:
                result = value*0.0010566882;
                break;

            case USLiquidPintId:
                result = value*0.0021133764;
                break;

            case USLegalCupId:
                result = value*0.0042267528;
                break;

            case USFluidOunceId:
                result = value*0.0338140227;
                break;
            case USTableSpoonId:
                result = value*0.0676280454;
                break;
            case USTeaSpoonId:
                result = value*0.2028841362;
                break;

            case imperialGallonId:
                result = value*0.0002199692;
                break;
            case imperialQuartId:
                result = value*0.000879877;
                break;

            case imperialPintId:
                result = value*0.001759754;
                break;

            case imperialCupId:
                result = value*0.003519508;
                break;
            case imperialFluidOunceId:
                result = value*0.0351950797;
                break;

            case imperialTableSpoonId:
                result = value*0.0563121276;
                break;

            case imperialTeaSpoonId:
                result = value*0.1689363827;
                break;
        }

        return result;
    }





    private double cubickilometerToOthers(String sourceUnit,String destUnit,double value){
        double result=0;
        switch (getUnitId(destUnit)){

            case literId:
                result = value*Math.pow(10,12);
                break;

            case milliLiterId:
                result = value*Math.pow(10,15);
                break;
            case cubicMeterId:
                result = value*Math.pow(10,9);
                break;
            case cubicCentiMeterId:
                result = value*Math.pow(10,15);
                break;
            case cubickilometerId:
                result = value;
                break;

            case cubicMilliMeterId:
                result = value*Math.pow(10,18);
                break;
            case cubicFootId:
                result = value*3.5314666721*Math.pow(10,10);
                break;

            case cubicInchId:
                result = value*6.1023744094732*Math.pow(10,13);
                break;

            case USLiquidGallonId:
                result = value*2.64172052358*Math.pow(10,11);
                break;
            case USLiquidQuartId:
                result = value*1.056688209433*Math.pow(10,12);
                break;

            case USLiquidPintId:
                result = value*2.113376418865*Math.pow(10,12);
                break;

            case USLegalCupId:
                result = value*4.226752837730*Math.pow(10,12);
                break;

            case USFluidOunceId:
                result = value*3.3814022701843*Math.pow(10,13);
                break;
            case USTableSpoonId:
                result = value*6.7628045403686*Math.pow(10,13);
                break;
            case USTeaSpoonId:
                result = value*2.02884136211060*Math.pow(10,14);
                break;

            case imperialGallonId:
                result = value*2.19969248299*Math.pow(10,11);
                break;
            case imperialQuartId:
                result = value*8.79876993196*Math.pow(10,11);
                break;

            case imperialPintId:
                result = value*1.759753986393*Math.pow(10,12);
                break;

            case imperialCupId:
                result = value*3.519507972785*Math.pow(10,12);
                break;
            case imperialFluidOunceId:
                result = value*3.5195079727854*Math.pow(10,13);
                break;

            case imperialTableSpoonId:
                result = value*5.6312127564566*Math.pow(10,13);
                break;

            case imperialTeaSpoonId:
                result = value*1.68936382693700*Math.pow(10,14);
                break;
        }

        return result;
    }




    private double cubicMilliMeterToOthers(String sourceUnit,String destUnit,double value){
        double result=0;
        switch (getUnitId(destUnit)){

            case literId:
                result = value*Math.pow(10,-6);
                break;

            case milliLiterId:
                result = value*0.001;
                break;
            case cubicMeterId:
                result = value*Math.pow(10,-9);
                break;
            case cubicCentiMeterId:
                result = value*0.001;
                break;
            case cubickilometerId:
                result = value*Math.pow(10,-18);
                break;

            case cubicMilliMeterId:
                result = value;
                break;
            case cubicFootId:
                result = value*3.531466672*Math.pow(10,-8);
                break;

            case cubicInchId:
                result = value*0.0000610237;
                break;

            case USLiquidGallonId:
                result = value*2.641720523*Math.pow(10,-7);
                break;
            case USLiquidQuartId:
                result = value*1.0567*Math.pow(10,-6);
                break;

            case USLiquidPintId:
                result = value*2.1134*Math.pow(10,-6);
                break;

            case USLegalCupId:
                result = value*0.0000042268;
                break;

            case USFluidOunceId:
                result = value*3.3814*Math.pow(10,-5);
                break;
            case USTableSpoonId:
                result = value*6.7628*Math.pow(10,-5);
                break;
            case USTeaSpoonId:
                result = value*0.0002028841;
                break;

            case imperialGallonId:
                result = value*2.199692482*Math.pow(10,-7);
                break;
            case imperialQuartId:
                result = value*8.798769931*Math.pow(10,-7);
                break;

            case imperialPintId:
                result = value*1.7598*Math.pow(10,-6);
                break;

            case imperialCupId:
                result = value*3.5195*Math.pow(10,-6);
                break;
            case imperialFluidOunceId:
                result = value*3.51951*Math.pow(10,-5);
                break;

            case imperialTableSpoonId:
                result = value*5.63121*Math.pow(10,-5);
                break;

            case imperialTeaSpoonId:
                result = value*0.0001689364;
                break;
        }

        return result;
    }





    private double cubicFootToOthers(String sourceUnit,String destUnit,double value){
        double result=0;
        switch (getUnitId(destUnit)){

            case literId:
                result = value*28.316846592;
                break;

            case milliLiterId:
                result = value*28316.846592;
                break;
            case cubicMeterId:
                result = value*0.0283168466;
                break;
            case cubicCentiMeterId:
                result = value*28316.846592;
                break;
            case cubickilometerId:
                result = value*2.831684659*Math.pow(10,-11);
                break;

            case cubicMilliMeterId:
                result = value*2.8316846592*Math.pow(10,7);
                break;
            case cubicFootId:
                result = value;
                break;

            case cubicInchId:
                result = value*1728;
                break;

            case USLiquidGallonId:
                result = value*7.4805194805;
                break;
            case USLiquidQuartId:
                result = value*29.922077922;
                break;

            case USLiquidPintId:
                result = value*59.844155844;
                break;

            case USLegalCupId:
                result = value*117.986860;
                break;

            case USFluidOunceId:
                result = value*957.50649351;
                break;
            case USTableSpoonId:
                result = value*1915.012987;
                break;
            case USTeaSpoonId:
                result = value*5745.038961;
                break;

            case imperialGallonId:
                result = value*6.228835459;
                break;
            case imperialQuartId:
                result = value*24.915341836;
                break;

            case imperialPintId:
                result = value*49.830683672;
                break;

            case imperialCupId:
                result = value*99.661367345;
                break;
            case imperialFluidOunceId:
                result = value*996.61367345;
                break;

            case imperialTableSpoonId:
                result = value*1594.5818775;
                break;

            case imperialTeaSpoonId:
                result = value*4783.7456325;
                break;
        }

        return result;
    }





    private double cubicInchToOthers(String sourceUnit,String destUnit,double value){
        double result=0;
        switch (getUnitId(destUnit)){

            case literId:
                result = value*0.016387064;
                break;

            case milliLiterId:
                result = value*16.387064;
                break;
            case cubicMeterId:
                result = value*0.0000163871;
                break;
            case cubicCentiMeterId:
                result = value*16.387064;
                break;
            case cubickilometerId:
                result = value*1.6387064*Math.pow(10,-14);
                break;

            case cubicMilliMeterId:
                result = value*16387.064;
                break;
            case cubicFootId:
                result = value*0.0005787037;
                break;

            case cubicInchId:
                result = value;
                break;

            case USLiquidGallonId:
                result = value*0.0043290043;
                break;
            case USLiquidQuartId:
                result = value*0.0173160173;
                break;

            case USLiquidPintId:
                result = value*0.0346320346;
                break;

            case USLegalCupId:
                result = value*0.0692640693;
                break;

            case USFluidOunceId:
                result = value*0.5541125541;
                break;
            case USTableSpoonId:
                result = value*1.1082251082;
                break;
            case USTeaSpoonId:
                result = value*3.3246753247;
                break;

            case imperialGallonId:
                result = value*0.0036046501;
                break;
            case imperialQuartId:
                result = value*0.0144186006;
                break;

            case imperialPintId:
                result = value*0.0288372012;
                break;

            case imperialCupId:
                result = value*0.0576744024;
                break;
            case imperialFluidOunceId:
                result = value*0.576744024;
                break;

            case imperialTableSpoonId:
                result = value*0.9227904384;
                break;

            case imperialTeaSpoonId:
                result = value*2.7683713151;
                break;
        }

        return result;
    }




    private double USLiquidGallonToOthers(String sourceUnit,String destUnit,double value){
        double result=0;
        switch (getUnitId(destUnit)){

            case literId:
                result = value*3.785411784;
                break;

            case milliLiterId:
                result = value*3785.411784;
                break;
            case cubicMeterId:
                result = value*0.0037854118;
                break;
            case cubicCentiMeterId:
                result = value*3785.411784;
                break;
            case cubickilometerId:
                result = value*3.785411783*Math.pow(10,-12);
                break;

            case cubicMilliMeterId:
                result = value*3785411.784;
                break;
            case cubicFootId:
                result = value*0.1336805556;
                break;

            case cubicInchId:
                result = value*231;
                break;

            case USLiquidGallonId:
                result = value;
                break;
            case USLiquidQuartId:
                result = value*4;
                break;

            case USLiquidPintId:
                result = value*8;
                break;

            case USLegalCupId:
                result = value*16;
                break;

            case USFluidOunceId:
                result = value*128;
                break;
            case USTableSpoonId:
                result = value*256;
                break;
            case USTeaSpoonId:
                result = value*768;
                break;

            case imperialGallonId:
                result = value*0.8326741846;
                break;
            case imperialQuartId:
                result = value*3.3306967385;
                break;

            case imperialPintId:
                result = value*6.661393477;
                break;

            case imperialCupId:
                result = value*13.322786954;
                break;
            case imperialFluidOunceId:
                result = value*133.22786954;
                break;

            case imperialTableSpoonId:
                result = value*213.16459127;
                break;

            case imperialTeaSpoonId:
                result = value*639.4937738;
                break;
        }

        return result;
    }





    private double USLiquidQuartToOthers(String sourceUnit,String destUnit,double value){
        double result=0;
        switch (getUnitId(destUnit)){

            case literId:
                result = value*0.946352946;
                break;

            case milliLiterId:
                result = value*946.352946;
                break;
            case cubicMeterId:
                result = value*0.0009463529;
                break;
            case cubicCentiMeterId:
                result = value*946.352946;
                break;
            case cubickilometerId:
                result = value*9.463529459*Math.pow(10,-13);
                break;

            case cubicMilliMeterId:
                result = value*946352.946;
                break;
            case cubicFootId:
                result = value*0.0334201389;
                break;

            case cubicInchId:
                result = value*57.75;
                break;

            case USLiquidGallonId:
                result = value*0.25;
                break;
            case USLiquidQuartId:
                result = value;
                break;

            case USLiquidPintId:
                result = value*2;
                break;

            case USLegalCupId:
                result = value*4;
                break;

            case USFluidOunceId:
                result = value*32;
                break;
            case USTableSpoonId:
                result = value*64;
                break;
            case USTeaSpoonId:
                result = value*192;
                break;

            case imperialGallonId:
                result = value*0.2081685462;
                break;
            case imperialQuartId:
                result = value*0.8326741846;
                break;

            case imperialPintId:
                result = value*1.6653483693;
                break;

            case imperialCupId:
                result = value*3.3306967385;
                break;
            case imperialFluidOunceId:
                result = value*33.306967385;
                break;

            case imperialTableSpoonId:
                result = value*53.291147816;
                break;

            case imperialTeaSpoonId:
                result = value*159.87344345;
                break;
        }

        return result;
    }




    private double USLiquidPintToOthers(String sourceUnit,String destUnit,double value){
        double result=0;
        switch (getUnitId(destUnit)){

            case literId:
                result = value*0.473176473;
                break;

            case milliLiterId:
                result = value*473.176473;
                break;
            case cubicMeterId:
                result = value*0.0004731765;
                break;
            case cubicCentiMeterId:
                result = value*473.176473;
                break;
            case cubickilometerId:
                result = value*4.731764729*Math.pow(10,-13);
                break;

            case cubicMilliMeterId:
                result = value*473176.473;
                break;
            case cubicFootId:
                result = value*0.0167100694;
                break;

            case cubicInchId:
                result = value*28.875;
                break;

            case USLiquidGallonId:
                result = value*0.125;
                break;
            case USLiquidQuartId:
                result = value*0.5;
                break;

            case USLiquidPintId:
                result = value;
                break;

            case USLegalCupId:
                result = value*2;
                break;

            case USFluidOunceId:
                result = value*16;
                break;
            case USTableSpoonId:
                result = value*32;
                break;
            case USTeaSpoonId:
                result = value*96;
                break;

            case imperialGallonId:
                result = value*0.1040842731;
                break;
            case imperialQuartId:
                result = value*0.4163370923;
                break;

            case imperialPintId:
                result = value*0.8326741846;
                break;

            case imperialCupId:
                result = value*1.6653483693;
                break;
            case imperialFluidOunceId:
                result = value*16.653483693;
                break;

            case imperialTableSpoonId:
                result = value*26.645573908;
                break;

            case imperialTeaSpoonId:
                result = value*79.936721724;
                break;
        }

        return result;
    }





    private double USLegalCupToOthers(String sourceUnit,String destUnit,double value){
        double result=0;
        switch (getUnitId(destUnit)){

            case literId:
                result = value*0.2365882365;
                break;

            case milliLiterId:
                result = value*236.5882365;
                break;
            case cubicMeterId:
                result = value*0.0002365882;
                break;
            case cubicCentiMeterId:
                result = value*236.5882365;
                break;
            case cubickilometerId:
                result = value*2.365882364*Math.pow(10,-13);
                break;

            case cubicMilliMeterId:
                result = value*236588.2365;
                break;
            case cubicFootId:
                result = value*0.0083550347;
                break;

            case cubicInchId:
                result = value*14.4375;
                break;

            case USLiquidGallonId:
                result = value*0.0625;
                break;
            case USLiquidQuartId:
                result = value*0.25;
                break;

            case USLiquidPintId:
                result = value*0.5;
                break;

            case USLegalCupId:
                result = value;
                break;

            case USFluidOunceId:
                result = value*8;
                break;
            case USTableSpoonId:
                result = value*16;
                break;
            case USTeaSpoonId:
                result = value*48;
                break;

            case imperialGallonId:
                result = value*0.0520421365;
                break;
            case imperialQuartId:
                result = value*0.2081685462;
                break;

            case imperialPintId:
                result = value*0.4163370923;
                break;

            case imperialCupId:
                result = value*0.8326741846;
                break;
            case imperialFluidOunceId:
                result = value*8.3267418463;
                break;

            case imperialTableSpoonId:
                result = value*13.322786954;
                break;

            case imperialTeaSpoonId:
                result = value*39.968360862;
                break;
        }

        return result;
    }




    private double USFluidOunceToOthers(String sourceUnit,String destUnit,double value){
        double result=0;
        switch (getUnitId(destUnit)){

            case literId:
                result = value*0.0295735296;
                break;

            case milliLiterId:
                result = value*29.573529562;
                break;
            case cubicMeterId:
                result = value*0.0000295735;
                break;
            case cubicCentiMeterId:
                result = value*29.573529562;
                break;
            case cubickilometerId:
                result = value*2.957352956*Math.pow(10,-14);
                break;

            case cubicMilliMeterId:
                result = value*29573.529562;
                break;
            case cubicFootId:
                result = value*0.0010443793;
                break;

            case cubicInchId:
                result = value*1.8046875;
                break;

            case USLiquidGallonId:
                result = value*0.0078125;
                break;
            case USLiquidQuartId:
                result = value*0.03125;
                break;

            case USLiquidPintId:
                result = value*0.0625;
                break;

            case USLegalCupId:
                result = value*0.125;
                break;

            case USFluidOunceId:
                result = value;
                break;
            case USTableSpoonId:
                result = value*2;
                break;
            case USTeaSpoonId:
                result = value*6;
                break;

            case imperialGallonId:
                result = value*0.0065052671;
                break;
            case imperialQuartId:
                result = value*0.0260210683;
                break;

            case imperialPintId:
                result = value*0.0520421365;
                break;

            case imperialCupId:
                result = value*0.1040842731;
                break;
            case imperialFluidOunceId:
                result = value*1.0408427308;
                break;

            case imperialTableSpoonId:
                result = value*1.6653483693;
                break;

            case imperialTeaSpoonId:
                result = value*4.9960451078;
                break;
        }

        return result;
    }




    private double USTableSpoonToOthers(String sourceUnit,String destUnit,double value){
        double result=0;
        switch (getUnitId(destUnit)){

            case literId:
                result = value/67.628;
                break;

            case milliLiterId:
                result = value*14.7868;
                break;
            case cubicMeterId:
                result = value*1.4787*Math.pow(10,-5);
                break;
            case cubicCentiMeterId:
                result = value*14.7868;
                break;
            case cubickilometerId:
                result = value*1.47868*Math.pow(10,-14);
                break;

            case cubicMilliMeterId:
                result = value*14786.8;
                break;
            case cubicFootId:
                result = value/1915;
                break;

            case cubicInchId:
                result = value/1.108;
                break;

            case USLiquidGallonId:
                result = value/256;
                break;
            case USLiquidQuartId:
                result = value/64;
                break;

            case USLiquidPintId:
                result = value/32;
                break;

            case USLegalCupId:
                result = value/16.231;
                break;

            case USFluidOunceId:
                result = value/2;
                break;
            case USTableSpoonId:
                result = value;
                break;
            case USTeaSpoonId:
                result = value*3;
                break;

            case imperialGallonId:
                result = value/307;
                break;
            case imperialQuartId:
                result = value/76.861;
                break;

            case imperialPintId:
                result = value/38.43;
                break;

            case imperialCupId:
                result = value/19.215;
                break;
            case imperialFluidOunceId:
                result = value/1.922;
                break;

            case imperialTableSpoonId:
                result = value/1.201;
                break;

            case imperialTeaSpoonId:
                result = value*2.49802;
                break;
        }

        return result;
    }



    private double USTeaSpoonToOthers(String sourceUnit,String destUnit,double value){
        double result=0;
        switch (getUnitId(destUnit)){

            case literId:
                result = value/203;
                break;

            case milliLiterId:
                result = value*4.92892;
                break;
            case cubicMeterId:
                result = value/202884;
                break;
            case cubicCentiMeterId:
                result = value*4.92892;
                break;
            case cubickilometerId:
                result = value*4.92892*Math.pow(10,-15);
                break;

            case cubicMilliMeterId:
                result = value*4928.92;
                break;
            case cubicFootId:
                result = value/5745;
                break;

            case cubicInchId:
                result = value/3.325;
                break;

            case USLiquidGallonId:
                result = value/768;
                break;
            case USLiquidQuartId:
                result = value/192;
                break;

            case USLiquidPintId:
                result = value/96;
                break;

            case USLegalCupId:
                result = value/48.692;
                break;

            case USFluidOunceId:
                result = value/6;
                break;
            case USTableSpoonId:
                result = value/3;
                break;
            case USTeaSpoonId:
                result = value;
                break;

            case imperialGallonId:
                result = value/922;
                break;
            case imperialQuartId:
                result = value/231;
                break;

            case imperialPintId:
                result = value/115;
                break;

            case imperialCupId:
                result = value/57.646;
                break;
            case imperialFluidOunceId:
                result = value/5.765;
                break;

            case imperialTableSpoonId:
                result = value/3.603;
                break;

            case imperialTeaSpoonId:
                result = value/1.201;
                break;
        }

        return result;
    }




    private double imperialGallonToOthers(String sourceUnit,String destUnit,double value){
        double result=0;
        switch (getUnitId(destUnit)){

            case literId:
                result = value*4.54609;
                break;

            case milliLiterId:
                result = value*4546.09;
                break;
            case cubicMeterId:
                result = value/220;
                break;
            case cubicCentiMeterId:
                result = value*4546.09;
                break;
            case cubickilometerId:
                result = value*4.54609*Math.pow(10,-12);
                break;

            case cubicMilliMeterId:
                result = value*4.546*Math.pow(10,6);
                break;
            case cubicFootId:
                result = value/6.229;
                break;

            case cubicInchId:
                result = value*277.419;
                break;

            case USLiquidGallonId:
                result = value*1.20095;
                break;
            case USLiquidQuartId:
                result = value*4.8038;
                break;

            case USLiquidPintId:
                result = value*9.6076;
                break;

            case USLegalCupId:
                result = value*18.942;
                break;

            case USFluidOunceId:
                result = value*153.722;
                break;
            case USTableSpoonId:
                result = value*307.443;
                break;
            case USTeaSpoonId:
                result = value*922.33;
                break;

            case imperialGallonId:
                result = value;
                break;
            case imperialQuartId:
                result = value*4;
                break;

            case imperialPintId:
                result = value*8;
                break;

            case imperialCupId:
                result = value*16;
                break;
            case imperialFluidOunceId:
                result = value*160;
                break;

            case imperialTableSpoonId:
                result = value*256;
                break;

            case imperialTeaSpoonId:
                result = value*768;
                break;
        }

        return result;
    }



    private double imperialQuartToOthers(String sourceUnit,String destUnit,double value){
        double result=0;
        switch (getUnitId(destUnit)){

            case literId:
                result = value*1.13652;
                break;

            case milliLiterId:
                result = value*1136.52;
                break;
            case cubicMeterId:
                result = value/880;
                break;
            case cubicCentiMeterId:
                result = value*1136.52;
                break;
            case cubickilometerId:
                result = value*1.13652*Math.pow(10,-12);
                break;

            case cubicMilliMeterId:
                result = value*1.137*Math.pow(10,6);
                break;
            case cubicFootId:
                result = value/24.915;
                break;

            case cubicInchId:
                result = value*69.3549;
                break;

            case USLiquidGallonId:
                result = value/3.331;
                break;
            case USLiquidQuartId:
                result = value*1.20095;
                break;

            case USLiquidPintId:
                result = value*2.4019;
                break;

            case USLegalCupId:
                result = value*4.73551;
                break;

            case USFluidOunceId:
                result = value*38.4304;
                break;
            case USTableSpoonId:
                result = value*76.8608;
                break;
            case USTeaSpoonId:
                result = value*230.582;
                break;

            case imperialGallonId:
                result = value/4;
                break;
            case imperialQuartId:
                result = value;
                break;

            case imperialPintId:
                result = value*2;
                break;

            case imperialCupId:
                result = value*4;
                break;
            case imperialFluidOunceId:
                result = value*40;
                break;

            case imperialTableSpoonId:
                result = value*64;
                break;

            case imperialTeaSpoonId:
                result = value*192;
                break;
        }

        return result;
    }




    private double imperialPintToOthers(String sourceUnit,String destUnit,double value){
        double result=0;
        switch (getUnitId(destUnit)){

            case literId:
                result = value/1.76;
                break;

            case milliLiterId:
                result = value*568.261;
                break;
            case cubicMeterId:
                result = value/1760;
                break;
            case cubicCentiMeterId:
                result = value*568.261;
                break;
            case cubickilometerId:
                result = value*5.68261*Math.pow(10,-13);
                break;

            case cubicMilliMeterId:
                result = value*568261;
                break;
            case cubicFootId:
                result = value/49.831;
                break;

            case cubicInchId:
                result = value*34.6774;
                break;

            case USLiquidGallonId:
                result = value/6.661;
                break;
            case USLiquidQuartId:
                result = value/1.665;
                break;

            case USLiquidPintId:
                result = value*1.20095;
                break;

            case USLegalCupId:
                result = value*2.36776;
                break;

            case USFluidOunceId:
                result = value*19.2152;
                break;
            case USTableSpoonId:
                result = value*38.4304;
                break;
            case USTeaSpoonId:
                result = value*115.291;
                break;

            case imperialGallonId:
                result = value/8;
                break;
            case imperialQuartId:
                result = value/2;
                break;

            case imperialPintId:
                result = value;
                break;

            case imperialCupId:
                result = value*2;
                break;
            case imperialFluidOunceId:
                result = value*20;
                break;

            case imperialTableSpoonId:
                result = value*32;
                break;

            case imperialTeaSpoonId:
                result = value*96;
                break;
        }

        return result;
    }




    private double imperialCupToOthers(String sourceUnit,String destUnit,double value){
        double result=0;
        switch (getUnitId(destUnit)){

            case literId:
                result = value/3.52;
                break;

            case milliLiterId:
                result = value*284.131;
                break;
            case cubicMeterId:
                result = value/3520;
                break;
            case cubicCentiMeterId:
                result = value*284.131;
                break;
            case cubickilometerId:
                result = value*2.84131*Math.pow(10,-13);
                break;

            case cubicMilliMeterId:
                result = value*284130.643;
                break;
            case cubicFootId:
                result = value/99.661;
                break;

            case cubicInchId:
                result = value*17.3387;
                break;

            case USLiquidGallonId:
                result = value/13.323;
                break;
            case USLiquidQuartId:
                result = value/3.331;
                break;

            case USLiquidPintId:
                result = value/1.665;
                break;

            case USLegalCupId:
                result = value*1.18388;
                break;

            case USFluidOunceId:
                result = value*9.6076;
                break;
            case USTableSpoonId:
                result = value*19.2152;
                break;
            case USTeaSpoonId:
                result = value*57.6456;
                break;

            case imperialGallonId:
                result = value/16;
                break;
            case imperialQuartId:
                result = value/4;
                break;

            case imperialPintId:
                result = value/2;
                break;

            case imperialCupId:
                result = value;
                break;
            case imperialFluidOunceId:
                result = value*10;
                break;

            case imperialTableSpoonId:
                result = value*16;
                break;

            case imperialTeaSpoonId:
                result = value*48;
                break;
        }

        return result;
    }



    private double imperialFluidOunceToOthers(String sourceUnit,String destUnit,double value){
        double result=0;
        switch (getUnitId(destUnit)){

            case literId:
                result = value/35.195;
                break;

            case milliLiterId:
                result = value*28.4131;
                break;
            case cubicMeterId:
                result = value/35195;
                break;
            case cubicCentiMeterId:
                result = value*28.4131;
                break;
            case cubickilometerId:
                result = value*2.84131*Math.pow(10,-14);
                break;

            case cubicMilliMeterId:
                result = value*28413.1;
                break;
            case cubicFootId:
                result = value/997;
                break;

            case cubicInchId:
                result = value*1.73387;
                break;

            case USLiquidGallonId:
                result = value/133;
                break;
            case USLiquidQuartId:
                result = value/33.307;
                break;

            case USLiquidPintId:
                result = value/16.653;
                break;

            case USLegalCupId:
                result = value/8.447;
                break;

            case USFluidOunceId:
                result = value/1.041;
                break;
            case USTableSpoonId:
                result = value*1.92152;
                break;
            case USTeaSpoonId:
                result = value*5.76456;
                break;

            case imperialGallonId:
                result = value/160;
                break;
            case imperialQuartId:
                result = value/40;
                break;

            case imperialPintId:
                result = value/20;
                break;

            case imperialCupId:
                result = value/10;
                break;
            case imperialFluidOunceId:
                result = value;
                break;

            case imperialTableSpoonId:
                result = value*1.6;
                break;

            case imperialTeaSpoonId:
                result = value*4.8;
                break;
        }

        return result;
    }




    private double imperialTableSpoonToOthers(String sourceUnit,String destUnit,double value){
        double result=0;
        switch (getUnitId(destUnit)){

            case literId:
                result = value/56.312;
                break;

            case milliLiterId:
                result = value*17.7582;
                break;
            case cubicMeterId:
                result = value/56312;
                break;
            case cubicCentiMeterId:
                result = value*17.7582;
                break;
            case cubickilometerId:
                result = value*1.77582*Math.pow(10,-14);
                break;

            case cubicMilliMeterId:
                result = value*17758.2;
                break;
            case cubicFootId:
                result = value/1595;
                break;

            case cubicInchId:
                result = value*1.08367;
                break;

            case USLiquidGallonId:
                result = value/213;
                break;
            case USLiquidQuartId:
                result = value/53.291;
                break;

            case USLiquidPintId:
                result = value/26.646;
                break;

            case USLegalCupId:
                result = value/13.515;
                break;

            case USFluidOunceId:
                result = value/1.665;
                break;
            case USTableSpoonId:
                result = value*1.20095;
                break;
            case USTeaSpoonId:
                result = value*3.60285;
                break;

            case imperialGallonId:
                result = value/256;
                break;
            case imperialQuartId:
                result = value/64;
                break;

            case imperialPintId:
                result = value/32;
                break;

            case imperialCupId:
                result = value/16;
                break;
            case imperialFluidOunceId:
                result = value/1.6;
                break;

            case imperialTableSpoonId:
                result = value;
                break;

            case imperialTeaSpoonId:
                result = value*3;
                break;
        }

        return result;
    }




    private double imperialTeaSpoonToOthers(String sourceUnit,String destUnit,double value){
        double result=0;
        switch (getUnitId(destUnit)){

            case literId:
                result = value/169;
                break;

            case milliLiterId:
                result = value*5.91939;
                break;
            case cubicMeterId:
                result = value/168936;
                break;
            case cubicCentiMeterId:
                result = value*5.91939;
                break;
            case cubickilometerId:
                result = value*5.91939*Math.pow(10,-15);
                break;

            case cubicMilliMeterId:
                result = value*4928.92;
                break;
            case cubicFootId:
                result = value/4784;
                break;

            case cubicInchId:
                result = value/2.768;
                break;

            case USLiquidGallonId:
                result = value/639;
                break;
            case USLiquidQuartId:
                result = value/160;
                break;

            case USLiquidPintId:
                result = value/79.937;
                break;

            case USLegalCupId:
                result = value/40.545;
                break;

            case USFluidOunceId:
                result = value/4.996;
                break;
            case USTableSpoonId:
                result = value/2.498;
                break;
            case USTeaSpoonId:
                result = value*1.20095;
                break;

            case imperialGallonId:
                result = value/768;
                break;
            case imperialQuartId:
                result = value/192;
                break;

            case imperialPintId:
                result = value/96;
                break;

            case imperialCupId:
                result = value/48;
                break;
            case imperialFluidOunceId:
                result = value/4.8;
                break;

            case imperialTableSpoonId:
                result = value/3;
                break;

            case imperialTeaSpoonId:
                result = value;
                break;
        }

        return result;
    }



}
