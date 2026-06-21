package yads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class b63 extends w21 {
    public static final Parcelable.Creator<b63> CREATOR = new a63();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f36945c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f36946d;

    public b63(Parcel parcel) {
        super((String) lb3.a((Object) parcel.readString()));
        this.f36945c = parcel.readString();
        this.f36946d = (String) lb3.a((Object) parcel.readString());
    }

    public static ArrayList a(String str) {
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

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b63.class == obj.getClass()) {
            b63 b63Var = (b63) obj;
            if (lb3.a(this.f44259b, b63Var.f44259b) && lb3.a(this.f36945c, b63Var.f36945c) && lb3.a(this.f36946d, b63Var.f36946d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iA = k4.a(this.f44259b, 527, 31);
        String str = this.f36945c;
        int iHashCode = (iA + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f36946d;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // yads.w21
    public final String toString() {
        return this.f44259b + ": description=" + this.f36945c + ": value=" + this.f36946d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f44259b);
        parcel.writeString(this.f36945c);
        parcel.writeString(this.f36946d);
    }

    public b63(String str, String str2, String str3) {
        super(str);
        this.f36945c = str2;
        this.f36946d = str3;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // yads.us1
    public final void a(km1 km1Var) {
        byte b2;
        String str = this.f44259b;
        str.getClass();
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
            case 2569891:
                b2 = !str.equals("TDAT") ? (byte) -1 : (byte) 12;
                break;
            case 2570401:
                b2 = !str.equals("TDRC") ? (byte) -1 : (byte) 13;
                break;
            case 2570410:
                b2 = !str.equals("TDRL") ? (byte) -1 : (byte) 14;
                break;
            case 2571565:
                b2 = !str.equals("TEXT") ? (byte) -1 : (byte) 15;
                break;
            case 2575251:
                b2 = !str.equals("TIT2") ? (byte) -1 : (byte) 16;
                break;
            case 2581512:
                b2 = !str.equals("TPE1") ? (byte) -1 : (byte) 17;
                break;
            case 2581513:
                b2 = !str.equals("TPE2") ? (byte) -1 : (byte) 18;
                break;
            case 2581514:
                b2 = !str.equals("TPE3") ? (byte) -1 : (byte) 19;
                break;
            case 2583398:
                b2 = !str.equals("TRCK") ? (byte) -1 : (byte) 20;
                break;
            case 2590194:
                b2 = !str.equals("TYER") ? (byte) -1 : (byte) 21;
                break;
            default:
                b2 = -1;
                break;
        }
        try {
            switch (b2) {
                case 0:
                case 10:
                    km1Var.f40254c = this.f36946d;
                    break;
                case 1:
                case 11:
                    km1Var.f40274x = this.f36946d;
                    break;
                case 2:
                case 12:
                    int i = Integer.parseInt(this.f36946d.substring(2, 4));
                    int i10 = Integer.parseInt(this.f36946d.substring(0, 2));
                    km1Var.f40268r = Integer.valueOf(i);
                    km1Var.f40269s = Integer.valueOf(i10);
                    break;
                case 3:
                case 17:
                    km1Var.f40253b = this.f36946d;
                    break;
                case 4:
                case 18:
                    km1Var.f40255d = this.f36946d;
                    break;
                case 5:
                case 19:
                    km1Var.f40275y = this.f36946d;
                    break;
                case 6:
                case 20:
                    String str2 = this.f36946d;
                    int i11 = lb3.f40466a;
                    String[] strArrSplit = str2.split("/", -1);
                    int i12 = Integer.parseInt(strArrSplit[0]);
                    Integer numValueOf = strArrSplit.length > 1 ? Integer.valueOf(Integer.parseInt(strArrSplit[1])) : null;
                    km1Var.f40263m = Integer.valueOf(i12);
                    km1Var.f40264n = numValueOf;
                    break;
                case 7:
                case 16:
                    km1Var.f40252a = this.f36946d;
                    break;
                case 8:
                case 15:
                    km1Var.f40273w = this.f36946d;
                    break;
                case 9:
                case 21:
                    km1Var.f40267q = Integer.valueOf(Integer.parseInt(this.f36946d));
                    break;
                case 13:
                    ArrayList arrayListA = a(this.f36946d);
                    int size = arrayListA.size();
                    if (size != 1) {
                        if (size != 2) {
                            if (size == 3) {
                                km1Var.f40269s = (Integer) arrayListA.get(2);
                            }
                        }
                        km1Var.f40268r = (Integer) arrayListA.get(1);
                    }
                    km1Var.f40267q = (Integer) arrayListA.get(0);
                    break;
                case 14:
                    ArrayList arrayListA2 = a(this.f36946d);
                    int size2 = arrayListA2.size();
                    if (size2 != 1) {
                        if (size2 != 2) {
                            if (size2 == 3) {
                                km1Var.f40272v = (Integer) arrayListA2.get(2);
                            }
                        }
                        km1Var.f40271u = (Integer) arrayListA2.get(1);
                    }
                    km1Var.f40270t = (Integer) arrayListA2.get(0);
                    break;
            }
        } catch (NumberFormatException | StringIndexOutOfBoundsException unused) {
        }
    }
}
