package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class ji implements Parcelable.Creator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6850a;

    public /* synthetic */ ji(int i) {
        this.f6850a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f6850a) {
            case 0:
                int iS = i0.o.S(parcel);
                boolean zF = false;
                boolean zF2 = false;
                boolean zF3 = false;
                long jI = 0;
                ParcelFileDescriptor parcelFileDescriptor = null;
                while (parcel.dataPosition() < iS) {
                    int i = parcel.readInt();
                    char c8 = (char) i;
                    if (c8 == 2) {
                        parcelFileDescriptor = (ParcelFileDescriptor) i0.o.m(parcel, i, ParcelFileDescriptor.CREATOR);
                    } else if (c8 == 3) {
                        zF = i0.o.F(parcel, i);
                    } else if (c8 == 4) {
                        zF2 = i0.o.F(parcel, i);
                    } else if (c8 == 5) {
                        jI = i0.o.I(parcel, i);
                    } else if (c8 != 6) {
                        i0.o.O(parcel, i);
                    } else {
                        zF3 = i0.o.F(parcel, i);
                    }
                }
                i0.o.v(parcel, iS);
                return new ii(parcelFileDescriptor, zF, zF2, jI, zF3);
            case 1:
                int iS2 = i0.o.S(parcel);
                boolean zF4 = false;
                int iH = 0;
                String strN = null;
                String strN2 = null;
                String strN3 = null;
                String strN4 = null;
                Bundle bundleI = null;
                String strN5 = null;
                long jI2 = 0;
                long jI3 = 0;
                while (parcel.dataPosition() < iS2) {
                    int i10 = parcel.readInt();
                    switch ((char) i10) {
                        case 2:
                            strN = i0.o.n(parcel, i10);
                            break;
                        case 3:
                            jI2 = i0.o.I(parcel, i10);
                            break;
                        case 4:
                            strN2 = i0.o.n(parcel, i10);
                            break;
                        case 5:
                            strN3 = i0.o.n(parcel, i10);
                            break;
                        case 6:
                            strN4 = i0.o.n(parcel, i10);
                            break;
                        case 7:
                            bundleI = i0.o.i(parcel, i10);
                            break;
                        case '\b':
                            zF4 = i0.o.F(parcel, i10);
                            break;
                        case '\t':
                            jI3 = i0.o.I(parcel, i10);
                            break;
                        case '\n':
                            strN5 = i0.o.n(parcel, i10);
                            break;
                        case 11:
                            iH = i0.o.H(parcel, i10);
                            break;
                        default:
                            i0.o.O(parcel, i10);
                            break;
                    }
                }
                i0.o.v(parcel, iS2);
                return new li(strN, jI2, strN2, strN3, strN4, bundleI, zF4, jI3, strN5, iH);
            case 2:
                int iS3 = i0.o.S(parcel);
                int iH2 = 0;
                boolean zF5 = false;
                int iH3 = 0;
                boolean zF6 = false;
                int iH4 = 0;
                boolean zF7 = false;
                int iH5 = 0;
                int iH6 = 0;
                boolean zF8 = false;
                int iH7 = 0;
                q9.b3 b3Var = null;
                while (parcel.dataPosition() < iS3) {
                    int i11 = parcel.readInt();
                    switch ((char) i11) {
                        case 1:
                            iH2 = i0.o.H(parcel, i11);
                            break;
                        case 2:
                            zF5 = i0.o.F(parcel, i11);
                            break;
                        case 3:
                            iH3 = i0.o.H(parcel, i11);
                            break;
                        case 4:
                            zF6 = i0.o.F(parcel, i11);
                            break;
                        case 5:
                            iH4 = i0.o.H(parcel, i11);
                            break;
                        case 6:
                            b3Var = (q9.b3) i0.o.m(parcel, i11, q9.b3.CREATOR);
                            break;
                        case 7:
                            zF7 = i0.o.F(parcel, i11);
                            break;
                        case '\b':
                            iH5 = i0.o.H(parcel, i11);
                            break;
                        case '\t':
                            iH6 = i0.o.H(parcel, i11);
                            break;
                        case '\n':
                            zF8 = i0.o.F(parcel, i11);
                            break;
                        case 11:
                            iH7 = i0.o.H(parcel, i11);
                            break;
                        default:
                            i0.o.O(parcel, i11);
                            break;
                    }
                }
                i0.o.v(parcel, iS3);
                return new wm(iH2, zF5, iH3, zF6, iH4, b3Var, zF7, iH5, iH6, zF8, iH7);
            case 3:
                int iS4 = i0.o.S(parcel);
                String strN6 = null;
                String[] strArrO = null;
                String[] strArrO2 = null;
                while (parcel.dataPosition() < iS4) {
                    int i12 = parcel.readInt();
                    char c9 = (char) i12;
                    if (c9 == 1) {
                        strN6 = i0.o.n(parcel, i12);
                    } else if (c9 == 2) {
                        strArrO = i0.o.o(parcel, i12);
                    } else if (c9 != 3) {
                        i0.o.O(parcel, i12);
                    } else {
                        strArrO2 = i0.o.o(parcel, i12);
                    }
                }
                i0.o.v(parcel, iS4);
                return new ip(strN6, strArrO, strArrO2);
            case 4:
                int iS5 = i0.o.S(parcel);
                long jI4 = 0;
                boolean zF9 = false;
                int iH8 = 0;
                boolean zF10 = false;
                String strN7 = null;
                byte[] bArrJ = null;
                String[] strArrO3 = null;
                String[] strArrO4 = null;
                while (parcel.dataPosition() < iS5) {
                    int i13 = parcel.readInt();
                    switch ((char) i13) {
                        case 1:
                            zF9 = i0.o.F(parcel, i13);
                            break;
                        case 2:
                            strN7 = i0.o.n(parcel, i13);
                            break;
                        case 3:
                            iH8 = i0.o.H(parcel, i13);
                            break;
                        case 4:
                            bArrJ = i0.o.j(parcel, i13);
                            break;
                        case 5:
                            strArrO3 = i0.o.o(parcel, i13);
                            break;
                        case 6:
                            strArrO4 = i0.o.o(parcel, i13);
                            break;
                        case 7:
                            zF10 = i0.o.F(parcel, i13);
                            break;
                        case '\b':
                            jI4 = i0.o.I(parcel, i13);
                            break;
                        default:
                            i0.o.O(parcel, i13);
                            break;
                    }
                }
                i0.o.v(parcel, iS5);
                return new jp(zF9, strN7, iH8, bArrJ, strArrO3, strArrO4, zF10, jI4);
            case 5:
                int iS6 = i0.o.S(parcel);
                String strN8 = null;
                boolean zF11 = false;
                int iH9 = 0;
                String strN9 = null;
                while (parcel.dataPosition() < iS6) {
                    int i14 = parcel.readInt();
                    char c10 = (char) i14;
                    if (c10 == 1) {
                        strN8 = i0.o.n(parcel, i14);
                    } else if (c10 == 2) {
                        zF11 = i0.o.F(parcel, i14);
                    } else if (c10 == 3) {
                        iH9 = i0.o.H(parcel, i14);
                    } else if (c10 != 4) {
                        i0.o.O(parcel, i14);
                    } else {
                        strN9 = i0.o.n(parcel, i14);
                    }
                }
                i0.o.v(parcel, iS6);
                return new pp(iH9, strN8, strN9, zF11);
            case 6:
                int iS7 = i0.o.S(parcel);
                String strN10 = null;
                Bundle bundleI2 = null;
                while (parcel.dataPosition() < iS7) {
                    int i15 = parcel.readInt();
                    char c11 = (char) i15;
                    if (c11 == 1) {
                        strN10 = i0.o.n(parcel, i15);
                    } else if (c11 != 2) {
                        i0.o.O(parcel, i15);
                    } else {
                        bundleI2 = i0.o.i(parcel, i15);
                    }
                }
                i0.o.v(parcel, iS7);
                return new vp(bundleI2, strN10);
            case 7:
                int iS8 = i0.o.S(parcel);
                int iH10 = 0;
                int iH11 = 0;
                String strN11 = null;
                int iH12 = 0;
                while (parcel.dataPosition() < iS8) {
                    int i16 = parcel.readInt();
                    char c12 = (char) i16;
                    if (c12 == 1) {
                        iH12 = i0.o.H(parcel, i16);
                    } else if (c12 == 2) {
                        strN11 = i0.o.n(parcel, i16);
                    } else if (c12 == 3) {
                        iH11 = i0.o.H(parcel, i16);
                    } else if (c12 != 1000) {
                        i0.o.O(parcel, i16);
                    } else {
                        iH10 = i0.o.H(parcel, i16);
                    }
                }
                i0.o.v(parcel, iS8);
                return new wp(strN11, iH10, iH12, iH11);
            case 8:
                int iS9 = i0.o.S(parcel);
                int iH13 = 0;
                int iH14 = 0;
                int iH15 = 0;
                while (parcel.dataPosition() < iS9) {
                    int i17 = parcel.readInt();
                    char c13 = (char) i17;
                    if (c13 == 1) {
                        iH13 = i0.o.H(parcel, i17);
                    } else if (c13 == 2) {
                        iH14 = i0.o.H(parcel, i17);
                    } else if (c13 != 3) {
                        i0.o.O(parcel, i17);
                    } else {
                        iH15 = i0.o.H(parcel, i17);
                    }
                }
                i0.o.v(parcel, iS9);
                return new ts(iH13, iH14, iH15);
            case 9:
                int iS10 = i0.o.S(parcel);
                IBinder iBinderG = null;
                IBinder iBinderG2 = null;
                while (parcel.dataPosition() < iS10) {
                    int i18 = parcel.readInt();
                    char c14 = (char) i18;
                    if (c14 == 1) {
                        iBinderG = i0.o.G(parcel, i18);
                    } else if (c14 != 2) {
                        i0.o.O(parcel, i18);
                    } else {
                        iBinderG2 = i0.o.G(parcel, i18);
                    }
                }
                i0.o.v(parcel, iS10);
                return new vt(iBinderG, iBinderG2);
            case 10:
                int iS11 = i0.o.S(parcel);
                Bundle bundleI3 = null;
                q9.d3 d3Var = null;
                q9.g3 g3Var = null;
                String strN12 = null;
                ApplicationInfo applicationInfo = null;
                PackageInfo packageInfo = null;
                String strN13 = null;
                String strN14 = null;
                String strN15 = null;
                u9.a aVar = null;
                Bundle bundleI4 = null;
                ArrayList arrayListP = null;
                Bundle bundleI5 = null;
                String strN16 = null;
                String strN17 = null;
                ArrayList arrayListP2 = null;
                String strN18 = null;
                wm wmVar = null;
                ArrayList arrayListP3 = null;
                String strN19 = null;
                String strN20 = null;
                String strN21 = null;
                Bundle bundleI6 = null;
                String strN22 = null;
                q9.d2 d2Var = null;
                Bundle bundleI7 = null;
                String strN23 = null;
                String strN24 = null;
                String strN25 = null;
                ArrayList arrayListL = null;
                String strN26 = null;
                ArrayList arrayListP4 = null;
                ArrayList arrayListP5 = null;
                String strN27 = null;
                wp wpVar = null;
                String strN28 = null;
                Bundle bundleI8 = null;
                int iH16 = 0;
                int iH17 = 0;
                boolean zF12 = false;
                int iH18 = 0;
                int iH19 = 0;
                boolean zF13 = false;
                int iH20 = 0;
                int iH21 = 0;
                boolean zF14 = false;
                boolean zF15 = false;
                int iH22 = 0;
                boolean zF16 = false;
                boolean zF17 = false;
                int iH23 = 0;
                boolean zF18 = false;
                boolean zF19 = false;
                boolean zF20 = false;
                float f10 = 0.0f;
                float f11 = 0.0f;
                long jI5 = 0;
                long jI6 = 0;
                while (parcel.dataPosition() < iS11) {
                    int i19 = parcel.readInt();
                    switch ((char) i19) {
                        case 1:
                            iH16 = i0.o.H(parcel, i19);
                            break;
                        case 2:
                            bundleI3 = i0.o.i(parcel, i19);
                            break;
                        case 3:
                            d3Var = (q9.d3) i0.o.m(parcel, i19, q9.d3.CREATOR);
                            break;
                        case 4:
                            g3Var = (q9.g3) i0.o.m(parcel, i19, q9.g3.CREATOR);
                            break;
                        case 5:
                            strN12 = i0.o.n(parcel, i19);
                            break;
                        case 6:
                            applicationInfo = (ApplicationInfo) i0.o.m(parcel, i19, ApplicationInfo.CREATOR);
                            break;
                        case 7:
                            packageInfo = (PackageInfo) i0.o.m(parcel, i19, PackageInfo.CREATOR);
                            break;
                        case '\b':
                            strN13 = i0.o.n(parcel, i19);
                            break;
                        case '\t':
                            strN14 = i0.o.n(parcel, i19);
                            break;
                        case '\n':
                            strN15 = i0.o.n(parcel, i19);
                            break;
                        case 11:
                            aVar = (u9.a) i0.o.m(parcel, i19, u9.a.CREATOR);
                            break;
                        case '\f':
                            bundleI4 = i0.o.i(parcel, i19);
                            break;
                        case '\r':
                            iH17 = i0.o.H(parcel, i19);
                            break;
                        case 14:
                            arrayListP = i0.o.p(parcel, i19);
                            break;
                        case 15:
                            bundleI5 = i0.o.i(parcel, i19);
                            break;
                        case 16:
                            zF12 = i0.o.F(parcel, i19);
                            break;
                        case 17:
                        case 22:
                        case 23:
                        case 24:
                        case ' ':
                        case '&':
                        case '>':
                        default:
                            i0.o.O(parcel, i19);
                            break;
                        case 18:
                            iH18 = i0.o.H(parcel, i19);
                            break;
                        case 19:
                            iH19 = i0.o.H(parcel, i19);
                            break;
                        case 20:
                            i0.o.W(parcel, i19, 4);
                            f10 = parcel.readFloat();
                            break;
                        case 21:
                            strN16 = i0.o.n(parcel, i19);
                            break;
                        case 25:
                            jI5 = i0.o.I(parcel, i19);
                            break;
                        case 26:
                            strN17 = i0.o.n(parcel, i19);
                            break;
                        case 27:
                            arrayListP2 = i0.o.p(parcel, i19);
                            break;
                        case 28:
                            strN18 = i0.o.n(parcel, i19);
                            break;
                        case 29:
                            wmVar = (wm) i0.o.m(parcel, i19, wm.CREATOR);
                            break;
                        case 30:
                            arrayListP3 = i0.o.p(parcel, i19);
                            break;
                        case 31:
                            jI6 = i0.o.I(parcel, i19);
                            break;
                        case '!':
                            strN19 = i0.o.n(parcel, i19);
                            break;
                        case '\"':
                            i0.o.W(parcel, i19, 4);
                            f11 = parcel.readFloat();
                            break;
                        case '#':
                            iH20 = i0.o.H(parcel, i19);
                            break;
                        case '$':
                            iH21 = i0.o.H(parcel, i19);
                            break;
                        case '%':
                            zF14 = i0.o.F(parcel, i19);
                            break;
                        case '\'':
                            strN20 = i0.o.n(parcel, i19);
                            break;
                        case '(':
                            zF13 = i0.o.F(parcel, i19);
                            break;
                        case ')':
                            strN21 = i0.o.n(parcel, i19);
                            break;
                        case '*':
                            zF15 = i0.o.F(parcel, i19);
                            break;
                        case '+':
                            iH22 = i0.o.H(parcel, i19);
                            break;
                        case ',':
                            bundleI6 = i0.o.i(parcel, i19);
                            break;
                        case '-':
                            strN22 = i0.o.n(parcel, i19);
                            break;
                        case '.':
                            d2Var = (q9.d2) i0.o.m(parcel, i19, q9.d2.CREATOR);
                            break;
                        case '/':
                            zF16 = i0.o.F(parcel, i19);
                            break;
                        case '0':
                            bundleI7 = i0.o.i(parcel, i19);
                            break;
                        case '1':
                            strN23 = i0.o.n(parcel, i19);
                            break;
                        case '2':
                            strN24 = i0.o.n(parcel, i19);
                            break;
                        case '3':
                            strN25 = i0.o.n(parcel, i19);
                            break;
                        case '4':
                            zF17 = i0.o.F(parcel, i19);
                            break;
                        case '5':
                            arrayListL = i0.o.l(parcel, i19);
                            break;
                        case '6':
                            strN26 = i0.o.n(parcel, i19);
                            break;
                        case '7':
                            arrayListP4 = i0.o.p(parcel, i19);
                            break;
                        case '8':
                            iH23 = i0.o.H(parcel, i19);
                            break;
                        case '9':
                            zF18 = i0.o.F(parcel, i19);
                            break;
                        case ':':
                            zF19 = i0.o.F(parcel, i19);
                            break;
                        case ';':
                            zF20 = i0.o.F(parcel, i19);
                            break;
                        case '<':
                            arrayListP5 = i0.o.p(parcel, i19);
                            break;
                        case '=':
                            strN27 = i0.o.n(parcel, i19);
                            break;
                        case '?':
                            wpVar = (wp) i0.o.m(parcel, i19, wp.CREATOR);
                            break;
                        case '@':
                            strN28 = i0.o.n(parcel, i19);
                            break;
                        case 'A':
                            bundleI8 = i0.o.i(parcel, i19);
                            break;
                    }
                }
                i0.o.v(parcel, iS11);
                return new au(iH16, bundleI3, d3Var, g3Var, strN12, applicationInfo, packageInfo, strN13, strN14, strN15, aVar, bundleI4, iH17, arrayListP, bundleI5, zF12, iH18, iH19, f10, strN16, jI5, strN17, arrayListP2, strN18, wmVar, arrayListP3, jI6, strN19, f11, zF13, iH20, iH21, zF14, strN20, strN21, zF15, iH22, bundleI6, strN22, d2Var, zF16, bundleI7, strN23, strN24, strN25, zF17, arrayListL, strN26, arrayListP4, iH23, zF18, zF19, zF20, arrayListP5, strN27, wpVar, strN28, bundleI8);
            case 11:
                int iS12 = i0.o.S(parcel);
                ArrayList arrayListP6 = null;
                boolean zF21 = false;
                while (parcel.dataPosition() < iS12) {
                    int i20 = parcel.readInt();
                    char c15 = (char) i20;
                    if (c15 == 2) {
                        zF21 = i0.o.F(parcel, i20);
                    } else if (c15 != 3) {
                        i0.o.O(parcel, i20);
                    } else {
                        arrayListP6 = i0.o.p(parcel, i20);
                    }
                }
                i0.o.v(parcel, iS12);
                return new bu(zF21, arrayListP6);
            case 12:
                int iS13 = i0.o.S(parcel);
                String strN29 = null;
                while (parcel.dataPosition() < iS13) {
                    int i21 = parcel.readInt();
                    if (((char) i21) != 1) {
                        i0.o.O(parcel, i21);
                    } else {
                        strN29 = i0.o.n(parcel, i21);
                    }
                }
                i0.o.v(parcel, iS13);
                return new cu(strN29);
            case 13:
                int iS14 = i0.o.S(parcel);
                boolean zF22 = false;
                boolean zF23 = false;
                int iH24 = 0;
                Bundle bundleI9 = null;
                u9.a aVar2 = null;
                ApplicationInfo applicationInfo2 = null;
                String strN30 = null;
                ArrayList arrayListP7 = null;
                PackageInfo packageInfo2 = null;
                String strN31 = null;
                String strN32 = null;
                xq0 xq0Var = null;
                String strN33 = null;
                Bundle bundleI10 = null;
                Bundle bundleI11 = null;
                while (parcel.dataPosition() < iS14) {
                    int i22 = parcel.readInt();
                    switch ((char) i22) {
                        case 1:
                            bundleI9 = i0.o.i(parcel, i22);
                            break;
                        case 2:
                            aVar2 = (u9.a) i0.o.m(parcel, i22, u9.a.CREATOR);
                            break;
                        case 3:
                            applicationInfo2 = (ApplicationInfo) i0.o.m(parcel, i22, ApplicationInfo.CREATOR);
                            break;
                        case 4:
                            strN30 = i0.o.n(parcel, i22);
                            break;
                        case 5:
                            arrayListP7 = i0.o.p(parcel, i22);
                            break;
                        case 6:
                            packageInfo2 = (PackageInfo) i0.o.m(parcel, i22, PackageInfo.CREATOR);
                            break;
                        case 7:
                            strN31 = i0.o.n(parcel, i22);
                            break;
                        case '\b':
                        default:
                            i0.o.O(parcel, i22);
                            break;
                        case '\t':
                            strN32 = i0.o.n(parcel, i22);
                            break;
                        case '\n':
                            xq0Var = (xq0) i0.o.m(parcel, i22, xq0.CREATOR);
                            break;
                        case 11:
                            strN33 = i0.o.n(parcel, i22);
                            break;
                        case '\f':
                            zF22 = i0.o.F(parcel, i22);
                            break;
                        case '\r':
                            zF23 = i0.o.F(parcel, i22);
                            break;
                        case 14:
                            bundleI10 = i0.o.i(parcel, i22);
                            break;
                        case 15:
                            bundleI11 = i0.o.i(parcel, i22);
                            break;
                        case 16:
                            iH24 = i0.o.H(parcel, i22);
                            break;
                    }
                }
                i0.o.v(parcel, iS14);
                return new ku(bundleI9, aVar2, applicationInfo2, strN30, arrayListP7, packageInfo2, strN31, strN32, xq0Var, strN33, zF22, zF23, bundleI10, bundleI11, iH24);
            case 14:
                int iS15 = i0.o.S(parcel);
                q9.d3 d3Var2 = null;
                String strN34 = null;
                while (parcel.dataPosition() < iS15) {
                    int i23 = parcel.readInt();
                    char c16 = (char) i23;
                    if (c16 == 2) {
                        d3Var2 = (q9.d3) i0.o.m(parcel, i23, q9.d3.CREATOR);
                    } else if (c16 != 3) {
                        i0.o.O(parcel, i23);
                    } else {
                        strN34 = i0.o.n(parcel, i23);
                    }
                }
                i0.o.v(parcel, iS15);
                return new vu(strN34, d3Var2);
            case 15:
                int iS16 = i0.o.S(parcel);
                int iH25 = 0;
                String strN35 = null;
                while (parcel.dataPosition() < iS16) {
                    int i24 = parcel.readInt();
                    char c17 = (char) i24;
                    if (c17 == 2) {
                        strN35 = i0.o.n(parcel, i24);
                    } else if (c17 != 3) {
                        i0.o.O(parcel, i24);
                    } else {
                        iH25 = i0.o.H(parcel, i24);
                    }
                }
                i0.o.v(parcel, iS16);
                return new zu(strN35, iH25);
            case 16:
                int iS17 = i0.o.S(parcel);
                String strN36 = null;
                String strN37 = null;
                while (parcel.dataPosition() < iS17) {
                    int i25 = parcel.readInt();
                    char c18 = (char) i25;
                    if (c18 == 1) {
                        strN36 = i0.o.n(parcel, i25);
                    } else if (c18 != 2) {
                        i0.o.O(parcel, i25);
                    } else {
                        strN37 = i0.o.n(parcel, i25);
                    }
                }
                i0.o.v(parcel, iS17);
                return new pv(strN36, strN37);
            case 17:
                int iS18 = i0.o.S(parcel);
                String strN38 = null;
                String strN39 = null;
                ArrayList arrayListP8 = null;
                ArrayList arrayListP9 = null;
                boolean zF24 = false;
                boolean zF25 = false;
                boolean zF26 = false;
                boolean zF27 = false;
                while (parcel.dataPosition() < iS18) {
                    int i26 = parcel.readInt();
                    switch ((char) i26) {
                        case 2:
                            strN38 = i0.o.n(parcel, i26);
                            break;
                        case 3:
                            strN39 = i0.o.n(parcel, i26);
                            break;
                        case 4:
                            zF24 = i0.o.F(parcel, i26);
                            break;
                        case 5:
                            zF25 = i0.o.F(parcel, i26);
                            break;
                        case 6:
                            arrayListP8 = i0.o.p(parcel, i26);
                            break;
                        case 7:
                            zF26 = i0.o.F(parcel, i26);
                            break;
                        case '\b':
                            zF27 = i0.o.F(parcel, i26);
                            break;
                        case '\t':
                            arrayListP9 = i0.o.p(parcel, i26);
                            break;
                        default:
                            i0.o.O(parcel, i26);
                            break;
                    }
                }
                i0.o.v(parcel, iS18);
                return new uv(strN38, strN39, zF24, zF25, arrayListP8, zF26, zF27, arrayListP9);
            case 18:
                int iS19 = i0.o.S(parcel);
                String strN40 = null;
                String strN41 = null;
                q9.g3 g3Var2 = null;
                q9.d3 d3Var3 = null;
                String strN42 = null;
                int iH26 = 0;
                while (parcel.dataPosition() < iS19) {
                    int i27 = parcel.readInt();
                    switch ((char) i27) {
                        case 1:
                            strN40 = i0.o.n(parcel, i27);
                            break;
                        case 2:
                            strN41 = i0.o.n(parcel, i27);
                            break;
                        case 3:
                            g3Var2 = (q9.g3) i0.o.m(parcel, i27, q9.g3.CREATOR);
                            break;
                        case 4:
                            d3Var3 = (q9.d3) i0.o.m(parcel, i27, q9.d3.CREATOR);
                            break;
                        case 5:
                            iH26 = i0.o.H(parcel, i27);
                            break;
                        case 6:
                            strN42 = i0.o.n(parcel, i27);
                            break;
                        default:
                            i0.o.O(parcel, i27);
                            break;
                    }
                }
                i0.o.v(parcel, iS19);
                return new tw(strN40, strN41, g3Var2, d3Var3, iH26, strN42);
            case 19:
                int iS20 = i0.o.S(parcel);
                int iH27 = 0;
                int iH28 = 0;
                int iH29 = 0;
                int iH30 = 0;
                int iH31 = 0;
                int iH32 = 0;
                String strN43 = null;
                while (parcel.dataPosition() < iS20) {
                    int i28 = parcel.readInt();
                    switch ((char) i28) {
                        case 1:
                            iH27 = i0.o.H(parcel, i28);
                            break;
                        case 2:
                            iH28 = i0.o.H(parcel, i28);
                            break;
                        case 3:
                            iH29 = i0.o.H(parcel, i28);
                            break;
                        case 4:
                            iH30 = i0.o.H(parcel, i28);
                            break;
                        case 5:
                            strN43 = i0.o.n(parcel, i28);
                            break;
                        case 6:
                            iH31 = i0.o.H(parcel, i28);
                            break;
                        case 7:
                            iH32 = i0.o.H(parcel, i28);
                            break;
                        default:
                            i0.o.O(parcel, i28);
                            break;
                    }
                }
                i0.o.v(parcel, iS20);
                return new xq0(iH27, iH28, iH29, iH30, strN43, iH31, iH32);
            case 20:
                int iS21 = i0.o.S(parcel);
                byte[] bArrJ2 = null;
                int iH33 = 0;
                while (parcel.dataPosition() < iS21) {
                    int i29 = parcel.readInt();
                    char c19 = (char) i29;
                    if (c19 == 1) {
                        iH33 = i0.o.H(parcel, i29);
                    } else if (c19 != 2) {
                        i0.o.O(parcel, i29);
                    } else {
                        bArrJ2 = i0.o.j(parcel, i29);
                    }
                }
                i0.o.v(parcel, iS21);
                return new qv0(iH33, bArrJ2);
            case 21:
                int iS22 = i0.o.S(parcel);
                String strN44 = null;
                int iH34 = 0;
                String strN45 = null;
                while (parcel.dataPosition() < iS22) {
                    int i30 = parcel.readInt();
                    char c20 = (char) i30;
                    if (c20 == 1) {
                        iH34 = i0.o.H(parcel, i30);
                    } else if (c20 == 2) {
                        strN44 = i0.o.n(parcel, i30);
                    } else if (c20 != 3) {
                        i0.o.O(parcel, i30);
                    } else {
                        strN45 = i0.o.n(parcel, i30);
                    }
                }
                i0.o.v(parcel, iS22);
                return new sv0(iH34, strN44, strN45);
            case 22:
                int iS23 = i0.o.S(parcel);
                byte[] bArrJ3 = null;
                int iH35 = 0;
                while (parcel.dataPosition() < iS23) {
                    int i31 = parcel.readInt();
                    char c21 = (char) i31;
                    if (c21 == 1) {
                        iH35 = i0.o.H(parcel, i31);
                    } else if (c21 != 2) {
                        i0.o.O(parcel, i31);
                    } else {
                        bArrJ3 = i0.o.j(parcel, i31);
                    }
                }
                i0.o.v(parcel, iS23);
                return new tv0(iH35, bArrJ3);
            case 23:
                int iS24 = i0.o.S(parcel);
                String strN46 = null;
                String strN47 = null;
                int iH36 = 0;
                int iH37 = 0;
                int iH38 = 0;
                while (parcel.dataPosition() < iS24) {
                    int i32 = parcel.readInt();
                    char c22 = (char) i32;
                    if (c22 == 1) {
                        iH36 = i0.o.H(parcel, i32);
                    } else if (c22 == 2) {
                        iH37 = i0.o.H(parcel, i32);
                    } else if (c22 == 3) {
                        strN46 = i0.o.n(parcel, i32);
                    } else if (c22 == 4) {
                        strN47 = i0.o.n(parcel, i32);
                    } else if (c22 != 5) {
                        i0.o.O(parcel, i32);
                    } else {
                        iH38 = i0.o.H(parcel, i32);
                    }
                }
                i0.o.v(parcel, iS24);
                return new wv0(iH36, iH37, iH38, strN46, strN47);
            case 24:
                int iS25 = i0.o.S(parcel);
                int iH39 = 0;
                byte[] bArrJ4 = null;
                int iH40 = 0;
                while (parcel.dataPosition() < iS25) {
                    int i33 = parcel.readInt();
                    char c23 = (char) i33;
                    if (c23 == 1) {
                        iH39 = i0.o.H(parcel, i33);
                    } else if (c23 == 2) {
                        bArrJ4 = i0.o.j(parcel, i33);
                    } else if (c23 != 3) {
                        i0.o.O(parcel, i33);
                    } else {
                        iH40 = i0.o.H(parcel, i33);
                    }
                }
                i0.o.v(parcel, iS25);
                return new xv0(bArrJ4, iH39, iH40);
            case 25:
                return new lv1(parcel);
            default:
                return new av1(parcel);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.f6850a) {
            case 0:
                return new ii[i];
            case 1:
                return new li[i];
            case 2:
                return new wm[i];
            case 3:
                return new ip[i];
            case 4:
                return new jp[i];
            case 5:
                return new pp[i];
            case 6:
                return new vp[i];
            case 7:
                return new wp[i];
            case 8:
                return new ts[i];
            case 9:
                return new vt[i];
            case 10:
                return new au[i];
            case 11:
                return new bu[i];
            case 12:
                return new cu[i];
            case 13:
                return new ku[i];
            case 14:
                return new vu[i];
            case 15:
                return new zu[i];
            case 16:
                return new pv[i];
            case 17:
                return new uv[i];
            case 18:
                return new tw[i];
            case 19:
                return new xq0[i];
            case 20:
                return new qv0[i];
            case 21:
                return new sv0[i];
            case 22:
                return new tv0[i];
            case 23:
                return new wv0[i];
            case 24:
                return new xv0[i];
            case 25:
                return new lv1[i];
            default:
                return new av1[i];
        }
    }
}
