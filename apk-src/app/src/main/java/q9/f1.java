package q9;

import android.location.Location;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class f1 implements Parcelable.Creator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31842a;

    public /* synthetic */ f1(int i) {
        this.f31842a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f31842a) {
            case 0:
                int iS = i0.o.S(parcel);
                String strN = null;
                String strN2 = null;
                while (parcel.dataPosition() < iS) {
                    int i = parcel.readInt();
                    char c8 = (char) i;
                    if (c8 == 1) {
                        strN = i0.o.n(parcel, i);
                    } else if (c8 != 2) {
                        i0.o.O(parcel, i);
                    } else {
                        strN2 = i0.o.n(parcel, i);
                    }
                }
                i0.o.v(parcel, iS);
                return new o0(strN, strN2);
            case 1:
                int iS2 = i0.o.S(parcel);
                int iH = 0;
                while (parcel.dataPosition() < iS2) {
                    int i10 = parcel.readInt();
                    if (((char) i10) != 2) {
                        i0.o.O(parcel, i10);
                    } else {
                        iH = i0.o.H(parcel, i10);
                    }
                }
                i0.o.v(parcel, iS2);
                return new d2(iH);
            case 2:
                int iS3 = i0.o.S(parcel);
                String strN3 = null;
                String strN4 = null;
                x1 x1Var = null;
                IBinder iBinderG = null;
                int iH2 = 0;
                while (parcel.dataPosition() < iS3) {
                    int i11 = parcel.readInt();
                    char c9 = (char) i11;
                    if (c9 == 1) {
                        iH2 = i0.o.H(parcel, i11);
                    } else if (c9 == 2) {
                        strN3 = i0.o.n(parcel, i11);
                    } else if (c9 == 3) {
                        strN4 = i0.o.n(parcel, i11);
                    } else if (c9 == 4) {
                        x1Var = (x1) i0.o.m(parcel, i11, x1.CREATOR);
                    } else if (c9 != 5) {
                        i0.o.O(parcel, i11);
                    } else {
                        iBinderG = i0.o.G(parcel, i11);
                    }
                }
                i0.o.v(parcel, iS3);
                return new x1(iH2, strN3, strN4, x1Var, iBinderG);
            case 3:
                int iS4 = i0.o.S(parcel);
                String strN5 = null;
                int iH3 = 0;
                int iH4 = 0;
                while (parcel.dataPosition() < iS4) {
                    int i12 = parcel.readInt();
                    char c10 = (char) i12;
                    if (c10 == 1) {
                        iH3 = i0.o.H(parcel, i12);
                    } else if (c10 == 2) {
                        iH4 = i0.o.H(parcel, i12);
                    } else if (c10 != 3) {
                        i0.o.O(parcel, i12);
                    } else {
                        strN5 = i0.o.n(parcel, i12);
                    }
                }
                i0.o.v(parcel, iS4);
                return new n2(iH3, iH4, strN5);
            case 4:
                int iS5 = i0.o.S(parcel);
                int iH5 = 0;
                String strN6 = null;
                d3 d3Var = null;
                int iH6 = 0;
                while (parcel.dataPosition() < iS5) {
                    int i13 = parcel.readInt();
                    char c11 = (char) i13;
                    if (c11 == 1) {
                        strN6 = i0.o.n(parcel, i13);
                    } else if (c11 == 2) {
                        iH5 = i0.o.H(parcel, i13);
                    } else if (c11 == 3) {
                        d3Var = (d3) i0.o.m(parcel, i13, d3.CREATOR);
                    } else if (c11 != 4) {
                        i0.o.O(parcel, i13);
                    } else {
                        iH6 = i0.o.H(parcel, i13);
                    }
                }
                i0.o.v(parcel, iS5);
                return new x2(strN6, iH5, d3Var, iH6);
            case 5:
                int iS6 = i0.o.S(parcel);
                int iH7 = 0;
                int iH8 = 0;
                while (parcel.dataPosition() < iS6) {
                    int i14 = parcel.readInt();
                    char c12 = (char) i14;
                    if (c12 == 1) {
                        iH7 = i0.o.H(parcel, i14);
                    } else if (c12 != 2) {
                        i0.o.O(parcel, i14);
                    } else {
                        iH8 = i0.o.H(parcel, i14);
                    }
                }
                i0.o.v(parcel, iS6);
                return new y2(iH7, iH8);
            case 6:
                int iS7 = i0.o.S(parcel);
                String strN7 = null;
                while (parcel.dataPosition() < iS7) {
                    int i15 = parcel.readInt();
                    if (((char) i15) != 15) {
                        i0.o.O(parcel, i15);
                    } else {
                        strN7 = i0.o.n(parcel, i15);
                    }
                }
                i0.o.v(parcel, iS7);
                return new z2(strN7);
            case 7:
                int iS8 = i0.o.S(parcel);
                boolean zF = false;
                boolean zF2 = false;
                boolean zF3 = false;
                while (parcel.dataPosition() < iS8) {
                    int i16 = parcel.readInt();
                    char c13 = (char) i16;
                    if (c13 == 2) {
                        zF = i0.o.F(parcel, i16);
                    } else if (c13 == 3) {
                        zF2 = i0.o.F(parcel, i16);
                    } else if (c13 != 4) {
                        i0.o.O(parcel, i16);
                    } else {
                        zF3 = i0.o.F(parcel, i16);
                    }
                }
                i0.o.v(parcel, iS8);
                return new b3(zF, zF2, zF3);
            case 8:
                int iS9 = i0.o.S(parcel);
                long jI = 0;
                long jI2 = 0;
                long jI3 = 0;
                int iH9 = 0;
                int iH10 = 0;
                boolean zF4 = false;
                int iH11 = 0;
                boolean zF5 = false;
                boolean zF6 = false;
                int iH12 = 0;
                int iH13 = 0;
                int iH14 = 0;
                Bundle bundleI = null;
                ArrayList arrayListP = null;
                String strN8 = null;
                z2 z2Var = null;
                Location location = null;
                String strN9 = null;
                Bundle bundleI2 = null;
                Bundle bundleI3 = null;
                ArrayList arrayListP2 = null;
                String strN10 = null;
                String strN11 = null;
                o0 o0Var = null;
                String strN12 = null;
                ArrayList arrayListP3 = null;
                String strN13 = null;
                while (parcel.dataPosition() < iS9) {
                    int i17 = parcel.readInt();
                    switch ((char) i17) {
                        case 1:
                            iH9 = i0.o.H(parcel, i17);
                            break;
                        case 2:
                            jI = i0.o.I(parcel, i17);
                            break;
                        case 3:
                            bundleI = i0.o.i(parcel, i17);
                            break;
                        case 4:
                            iH10 = i0.o.H(parcel, i17);
                            break;
                        case 5:
                            arrayListP = i0.o.p(parcel, i17);
                            break;
                        case 6:
                            zF4 = i0.o.F(parcel, i17);
                            break;
                        case 7:
                            iH11 = i0.o.H(parcel, i17);
                            break;
                        case '\b':
                            zF5 = i0.o.F(parcel, i17);
                            break;
                        case '\t':
                            strN8 = i0.o.n(parcel, i17);
                            break;
                        case '\n':
                            z2Var = (z2) i0.o.m(parcel, i17, z2.CREATOR);
                            break;
                        case 11:
                            location = (Location) i0.o.m(parcel, i17, Location.CREATOR);
                            break;
                        case '\f':
                            strN9 = i0.o.n(parcel, i17);
                            break;
                        case '\r':
                            bundleI2 = i0.o.i(parcel, i17);
                            break;
                        case 14:
                            bundleI3 = i0.o.i(parcel, i17);
                            break;
                        case 15:
                            arrayListP2 = i0.o.p(parcel, i17);
                            break;
                        case 16:
                            strN10 = i0.o.n(parcel, i17);
                            break;
                        case 17:
                            strN11 = i0.o.n(parcel, i17);
                            break;
                        case 18:
                            zF6 = i0.o.F(parcel, i17);
                            break;
                        case 19:
                            o0Var = (o0) i0.o.m(parcel, i17, o0.CREATOR);
                            break;
                        case 20:
                            iH12 = i0.o.H(parcel, i17);
                            break;
                        case 21:
                            strN12 = i0.o.n(parcel, i17);
                            break;
                        case 22:
                            arrayListP3 = i0.o.p(parcel, i17);
                            break;
                        case 23:
                            iH13 = i0.o.H(parcel, i17);
                            break;
                        case 24:
                            strN13 = i0.o.n(parcel, i17);
                            break;
                        case 25:
                            iH14 = i0.o.H(parcel, i17);
                            break;
                        case 26:
                            jI2 = i0.o.I(parcel, i17);
                            break;
                        case 27:
                            jI3 = i0.o.I(parcel, i17);
                            break;
                        default:
                            i0.o.O(parcel, i17);
                            break;
                    }
                }
                i0.o.v(parcel, iS9);
                return new d3(iH9, jI, bundleI, iH10, arrayListP, zF4, iH11, zF5, strN8, z2Var, location, strN9, bundleI2, bundleI3, arrayListP2, strN10, strN11, zF6, o0Var, iH12, strN12, arrayListP3, iH13, strN13, iH14, jI2, jI3);
            case 9:
                int iS10 = i0.o.S(parcel);
                int iH15 = 0;
                int iH16 = 0;
                boolean zF7 = false;
                int iH17 = 0;
                int iH18 = 0;
                boolean zF8 = false;
                boolean zF9 = false;
                boolean zF10 = false;
                boolean zF11 = false;
                boolean zF12 = false;
                boolean zF13 = false;
                boolean zF14 = false;
                boolean zF15 = false;
                String strN14 = null;
                g3[] g3VarArr = null;
                while (parcel.dataPosition() < iS10) {
                    int i18 = parcel.readInt();
                    switch ((char) i18) {
                        case 2:
                            strN14 = i0.o.n(parcel, i18);
                            break;
                        case 3:
                            iH15 = i0.o.H(parcel, i18);
                            break;
                        case 4:
                            iH16 = i0.o.H(parcel, i18);
                            break;
                        case 5:
                            zF7 = i0.o.F(parcel, i18);
                            break;
                        case 6:
                            iH17 = i0.o.H(parcel, i18);
                            break;
                        case 7:
                            iH18 = i0.o.H(parcel, i18);
                            break;
                        case '\b':
                            g3VarArr = (g3[]) i0.o.q(parcel, i18, g3.CREATOR);
                            break;
                        case '\t':
                            zF8 = i0.o.F(parcel, i18);
                            break;
                        case '\n':
                            zF9 = i0.o.F(parcel, i18);
                            break;
                        case 11:
                            zF10 = i0.o.F(parcel, i18);
                            break;
                        case '\f':
                            zF11 = i0.o.F(parcel, i18);
                            break;
                        case '\r':
                            zF12 = i0.o.F(parcel, i18);
                            break;
                        case 14:
                            zF13 = i0.o.F(parcel, i18);
                            break;
                        case 15:
                            zF14 = i0.o.F(parcel, i18);
                            break;
                        case 16:
                            zF15 = i0.o.F(parcel, i18);
                            break;
                        default:
                            i0.o.O(parcel, i18);
                            break;
                    }
                }
                i0.o.v(parcel, iS10);
                return new g3(strN14, iH15, iH16, zF7, iH17, iH18, g3VarArr, zF8, zF9, zF10, zF11, zF12, zF13, zF14, zF15);
            case 10:
                int iS11 = i0.o.S(parcel);
                long jI4 = 0;
                String strN15 = null;
                int iH19 = 0;
                int iH20 = 0;
                while (parcel.dataPosition() < iS11) {
                    int i19 = parcel.readInt();
                    char c14 = (char) i19;
                    if (c14 == 1) {
                        iH19 = i0.o.H(parcel, i19);
                    } else if (c14 == 2) {
                        iH20 = i0.o.H(parcel, i19);
                    } else if (c14 == 3) {
                        strN15 = i0.o.n(parcel, i19);
                    } else if (c14 != 4) {
                        i0.o.O(parcel, i19);
                    } else {
                        jI4 = i0.o.I(parcel, i19);
                    }
                }
                i0.o.v(parcel, iS11);
                return new h3(strN15, iH19, iH20, jI4);
            case 11:
                int iS12 = i0.o.S(parcel);
                String strN16 = null;
                x1 x1Var2 = null;
                Bundle bundleI4 = null;
                String strN17 = null;
                String strN18 = null;
                String strN19 = null;
                String strN20 = null;
                long jI5 = 0;
                while (parcel.dataPosition() < iS12) {
                    int i20 = parcel.readInt();
                    switch ((char) i20) {
                        case 1:
                            strN16 = i0.o.n(parcel, i20);
                            break;
                        case 2:
                            jI5 = i0.o.I(parcel, i20);
                            break;
                        case 3:
                            x1Var2 = (x1) i0.o.m(parcel, i20, x1.CREATOR);
                            break;
                        case 4:
                            bundleI4 = i0.o.i(parcel, i20);
                            break;
                        case 5:
                            strN17 = i0.o.n(parcel, i20);
                            break;
                        case 6:
                            strN18 = i0.o.n(parcel, i20);
                            break;
                        case 7:
                            strN19 = i0.o.n(parcel, i20);
                            break;
                        case '\b':
                            strN20 = i0.o.n(parcel, i20);
                            break;
                        default:
                            i0.o.O(parcel, i20);
                            break;
                    }
                }
                i0.o.v(parcel, iS12);
                return new i3(strN16, jI5, x1Var2, bundleI4, strN17, strN18, strN19, strN20);
            default:
                int iS13 = i0.o.S(parcel);
                int iH21 = 0;
                while (parcel.dataPosition() < iS13) {
                    int i21 = parcel.readInt();
                    if (((char) i21) != 2) {
                        i0.o.O(parcel, i21);
                    } else {
                        iH21 = i0.o.H(parcel, i21);
                    }
                }
                i0.o.v(parcel, iS13);
                return new j3(iH21);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.f31842a) {
            case 0:
                return new o0[i];
            case 1:
                return new d2[i];
            case 2:
                return new x1[i];
            case 3:
                return new n2[i];
            case 4:
                return new x2[i];
            case 5:
                return new y2[i];
            case 6:
                return new z2[i];
            case 7:
                return new b3[i];
            case 8:
                return new d3[i];
            case 9:
                return new g3[i];
            case 10:
                return new h3[i];
            case 11:
                return new i3[i];
            default:
                return new j3[i];
        }
    }
}
