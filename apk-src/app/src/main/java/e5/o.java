package e5;

import ad.b1;
import ad.j0;
import com.google.android.gms.internal.ads.w6;
import com.google.android.gms.internal.measurement.h5;
import java.util.ArrayList;
import java.util.Objects;
import m3.z;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class o extends j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f16264b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j0 f16265c;

    public o(String str, String str2, b1 b1Var) {
        super(str);
        h5.h(!b1Var.isEmpty());
        this.f16264b = str2;
        j0 j0VarR = j0.r(b1Var);
        this.f16265c = j0VarR;
    }

    public static ArrayList d(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            if (str.length() >= 10) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(8, 10))));
                return arrayList;
            }
            if (str.length() >= 7) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                return arrayList;
            }
            if (str.length() >= 4) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
            }
            return arrayList;
        } catch (NumberFormatException unused) {
            return new ArrayList();
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // j3.a0
    public final void b(w6 w6Var) {
        byte b2;
        String str = this.f16252a;
        switch (str.hashCode()) {
            case 82815:
                b2 = !str.equals("TAL") ? (byte) -1 : (byte) 0;
                break;
            case 82878:
                b2 = !str.equals("TCM") ? (byte) -1 : (byte) 1;
                break;
            case 82897:
                b2 = !str.equals("TDA") ? (byte) -1 : (byte) 2;
                break;
            case 83253:
                b2 = !str.equals("TP1") ? (byte) -1 : (byte) 3;
                break;
            case 83254:
                b2 = !str.equals("TP2") ? (byte) -1 : (byte) 4;
                break;
            case 83255:
                b2 = !str.equals("TP3") ? (byte) -1 : (byte) 5;
                break;
            case 83341:
                b2 = !str.equals("TRK") ? (byte) -1 : (byte) 6;
                break;
            case 83378:
                b2 = !str.equals("TT2") ? (byte) -1 : (byte) 7;
                break;
            case 83536:
                b2 = !str.equals("TXT") ? (byte) -1 : (byte) 8;
                break;
            case 83552:
                b2 = !str.equals("TYE") ? (byte) -1 : (byte) 9;
                break;
            case 2567331:
                b2 = !str.equals("TALB") ? (byte) -1 : (byte) 10;
                break;
            case 2569357:
                b2 = !str.equals("TCOM") ? (byte) -1 : (byte) 11;
                break;
            case 2569358:
                b2 = !str.equals("TCON") ? (byte) -1 : (byte) 12;
                break;
            case 2569891:
                b2 = !str.equals("TDAT") ? (byte) -1 : (byte) 13;
                break;
            case 2570401:
                b2 = !str.equals("TDRC") ? (byte) -1 : (byte) 14;
                break;
            case 2570410:
                b2 = !str.equals("TDRL") ? (byte) -1 : (byte) 15;
                break;
            case 2571565:
                b2 = !str.equals("TEXT") ? (byte) -1 : (byte) 16;
                break;
            case 2575251:
                b2 = !str.equals("TIT2") ? (byte) -1 : (byte) 17;
                break;
            case 2581512:
                b2 = !str.equals("TPE1") ? (byte) -1 : (byte) 18;
                break;
            case 2581513:
                b2 = !str.equals("TPE2") ? (byte) -1 : (byte) 19;
                break;
            case 2581514:
                b2 = !str.equals("TPE3") ? (byte) -1 : (byte) 20;
                break;
            case 2583398:
                b2 = !str.equals("TRCK") ? (byte) -1 : (byte) 21;
                break;
            case 2590194:
                b2 = !str.equals("TYER") ? (byte) -1 : (byte) 22;
                break;
            default:
                b2 = -1;
                break;
        }
        j0 j0Var = this.f16265c;
        try {
            switch (b2) {
                case 0:
                case 10:
                    w6Var.f11657c = (CharSequence) j0Var.get(0);
                    break;
                case 1:
                case 11:
                    w6Var.f11672s = (CharSequence) j0Var.get(0);
                    break;
                case 2:
                case 13:
                    String str2 = (String) j0Var.get(0);
                    int i = Integer.parseInt(str2.substring(2, 4));
                    int i10 = Integer.parseInt(str2.substring(0, 2));
                    w6Var.f11666m = Integer.valueOf(i);
                    w6Var.f11667n = Integer.valueOf(i10);
                    break;
                case 3:
                case 18:
                    w6Var.f11656b = (CharSequence) j0Var.get(0);
                    break;
                case 4:
                case 19:
                    w6Var.f11658d = (CharSequence) j0Var.get(0);
                    break;
                case 5:
                case 20:
                    w6Var.f11673t = (CharSequence) j0Var.get(0);
                    break;
                case 6:
                case 21:
                    String str3 = (String) j0Var.get(0);
                    String str4 = z.f28608a;
                    String[] strArrSplit = str3.split("/", -1);
                    int i11 = Integer.parseInt(strArrSplit[0]);
                    Integer numValueOf = strArrSplit.length > 1 ? Integer.valueOf(Integer.parseInt(strArrSplit[1])) : null;
                    w6Var.f11662h = Integer.valueOf(i11);
                    w6Var.i = numValueOf;
                    break;
                case 7:
                case 17:
                    w6Var.f11655a = (CharSequence) j0Var.get(0);
                    break;
                case 8:
                case 16:
                    w6Var.f11671r = (CharSequence) j0Var.get(0);
                    break;
                case 9:
                case 22:
                    w6Var.f11665l = Integer.valueOf(Integer.parseInt((String) j0Var.get(0)));
                    break;
                case 12:
                    Integer numH = k3.f.H((String) j0Var.get(0));
                    if (numH != null) {
                        String strA = k.a(numH.intValue());
                        if (strA != null) {
                            w6Var.f11676w = strA;
                        }
                    } else {
                        w6Var.f11676w = (CharSequence) j0Var.get(0);
                    }
                    break;
                case 14:
                    ArrayList arrayListD = d((String) j0Var.get(0));
                    int size = arrayListD.size();
                    if (size != 1) {
                        if (size != 2) {
                            if (size == 3) {
                                w6Var.f11667n = (Integer) arrayListD.get(2);
                            }
                        }
                        w6Var.f11666m = (Integer) arrayListD.get(1);
                    }
                    w6Var.f11665l = (Integer) arrayListD.get(0);
                    break;
                case 15:
                    ArrayList arrayListD2 = d((String) j0Var.get(0));
                    int size2 = arrayListD2.size();
                    if (size2 != 1) {
                        if (size2 != 2) {
                            if (size2 == 3) {
                                w6Var.f11670q = (Integer) arrayListD2.get(2);
                            }
                        }
                        w6Var.f11669p = (Integer) arrayListD2.get(1);
                    }
                    w6Var.f11668o = (Integer) arrayListD2.get(0);
                    break;
            }
        } catch (NumberFormatException | StringIndexOutOfBoundsException unused) {
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && o.class == obj.getClass()) {
            o oVar = (o) obj;
            if (Objects.equals(this.f16252a, oVar.f16252a) && Objects.equals(this.f16264b, oVar.f16264b) && this.f16265c.equals(oVar.f16265c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iE = gf.a.e(527, 31, this.f16252a);
        String str = this.f16264b;
        return this.f16265c.hashCode() + ((iE + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // e5.j
    public final String toString() {
        return this.f16252a + ": description=" + this.f16264b + ": values=" + this.f16265c;
    }
}
