package kb;

import android.accounts.Account;
import android.app.PendingIntent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.maps.model.LatLng;
import com.yandex.varioqub.config.model.ConfigValue;
import java.util.ArrayList;
import ma.t;
import ob.b4;
import ob.g4;
import ob.o3;
import ob.r3;
import ob.s3;
import ob.t3;
import ob.u;
import ob.v;
import pa.w;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements Parcelable.Creator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27345a;

    public /* synthetic */ i(int i) {
        this.f27345a = i;
    }

    public static void a(v vVar, Parcel parcel, int i) {
        String str = vVar.f30454b;
        int iI0 = j0.g.i0(parcel, 20293);
        j0.g.b0(parcel, 2, str);
        j0.g.a0(parcel, 3, vVar.f30455c, i);
        j0.g.b0(parcel, 4, vVar.f30456d);
        long j10 = vVar.f30457e;
        j0.g.h0(parcel, 5, 8);
        parcel.writeLong(j10);
        j0.g.m0(parcel, iI0);
    }

    public static void b(b4 b4Var, Parcel parcel) {
        int i = b4Var.f29964b;
        int iI0 = j0.g.i0(parcel, 20293);
        j0.g.h0(parcel, 1, 4);
        parcel.writeInt(i);
        j0.g.b0(parcel, 2, b4Var.f29965c);
        long j10 = b4Var.f29966d;
        j0.g.h0(parcel, 3, 8);
        parcel.writeLong(j10);
        Long l10 = b4Var.f29967e;
        if (l10 != null) {
            j0.g.h0(parcel, 4, 8);
            parcel.writeLong(l10.longValue());
        }
        j0.g.b0(parcel, 6, b4Var.f29968f);
        j0.g.b0(parcel, 7, b4Var.f29969g);
        Double d10 = b4Var.f29970h;
        if (d10 != null) {
            j0.g.h0(parcel, 8, 8);
            parcel.writeDouble(d10.doubleValue());
        }
        j0.g.m0(parcel, iI0);
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f27345a) {
            case 0:
                int iS = i0.o.S(parcel);
                boolean zF = false;
                ArrayList arrayListR = null;
                boolean zF2 = false;
                while (parcel.dataPosition() < iS) {
                    int i = parcel.readInt();
                    char c8 = (char) i;
                    if (c8 == 1) {
                        arrayListR = i0.o.r(parcel, i, LocationRequest.CREATOR);
                    } else if (c8 == 2) {
                        zF = i0.o.F(parcel, i);
                    } else if (c8 != 3) {
                        i0.o.O(parcel, i);
                    } else {
                        zF2 = i0.o.F(parcel, i);
                    }
                }
                i0.o.v(parcel, iS);
                return new e(arrayListR, zF, zF2);
            case 1:
                int iS2 = i0.o.S(parcel);
                Status status = null;
                h hVar = null;
                while (parcel.dataPosition() < iS2) {
                    int i10 = parcel.readInt();
                    char c9 = (char) i10;
                    if (c9 == 1) {
                        status = (Status) i0.o.m(parcel, i10, Status.CREATOR);
                    } else if (c9 != 2) {
                        i0.o.O(parcel, i10);
                    } else {
                        hVar = (h) i0.o.m(parcel, i10, h.CREATOR);
                    }
                }
                i0.o.v(parcel, iS2);
                return new g(status, hVar);
            case 2:
                int iS3 = i0.o.S(parcel);
                boolean zF3 = false;
                boolean zF4 = false;
                boolean zF5 = false;
                boolean zF6 = false;
                boolean zF7 = false;
                boolean zF8 = false;
                while (parcel.dataPosition() < iS3) {
                    int i11 = parcel.readInt();
                    switch ((char) i11) {
                        case 1:
                            zF3 = i0.o.F(parcel, i11);
                            break;
                        case 2:
                            zF4 = i0.o.F(parcel, i11);
                            break;
                        case 3:
                            zF5 = i0.o.F(parcel, i11);
                            break;
                        case 4:
                            zF6 = i0.o.F(parcel, i11);
                            break;
                        case 5:
                            zF7 = i0.o.F(parcel, i11);
                            break;
                        case 6:
                            zF8 = i0.o.F(parcel, i11);
                            break;
                        default:
                            i0.o.O(parcel, i11);
                            break;
                    }
                }
                i0.o.v(parcel, iS3);
                return new h(zF3, zF4, zF5, zF6, zF7, zF8);
            case 3:
                int iS4 = i0.o.S(parcel);
                long jI = -1;
                long jI2 = -1;
                int iH = 1;
                int iH2 = 1;
                while (parcel.dataPosition() < iS4) {
                    int i12 = parcel.readInt();
                    char c10 = (char) i12;
                    if (c10 == 1) {
                        iH = i0.o.H(parcel, i12);
                    } else if (c10 == 2) {
                        iH2 = i0.o.H(parcel, i12);
                    } else if (c10 == 3) {
                        jI = i0.o.I(parcel, i12);
                    } else if (c10 != 4) {
                        i0.o.O(parcel, i12);
                    } else {
                        jI2 = i0.o.I(parcel, i12);
                    }
                }
                i0.o.v(parcel, iS4);
                return new k(iH, iH2, jI, jI2);
            case 4:
                int iS5 = i0.o.S(parcel);
                double d10 = ConfigValue.DOUBLE_DEFAULT_VALUE;
                double d11 = 0.0d;
                while (parcel.dataPosition() < iS5) {
                    int i13 = parcel.readInt();
                    char c11 = (char) i13;
                    if (c11 == 2) {
                        i0.o.W(parcel, i13, 8);
                        d10 = parcel.readDouble();
                    } else if (c11 != 3) {
                        i0.o.O(parcel, i13);
                    } else {
                        i0.o.W(parcel, i13, 8);
                        d11 = parcel.readDouble();
                    }
                }
                i0.o.v(parcel, iS5);
                return new LatLng(d10, d11);
            case 5:
                int iS6 = i0.o.S(parcel);
                PendingIntent pendingIntent = null;
                String strN = null;
                Integer numValueOf = null;
                int iH3 = 0;
                int iH4 = 0;
                while (parcel.dataPosition() < iS6) {
                    int i14 = parcel.readInt();
                    char c12 = (char) i14;
                    if (c12 == 1) {
                        iH3 = i0.o.H(parcel, i14);
                    } else if (c12 == 2) {
                        iH4 = i0.o.H(parcel, i14);
                    } else if (c12 == 3) {
                        pendingIntent = (PendingIntent) i0.o.m(parcel, i14, PendingIntent.CREATOR);
                    } else if (c12 == 4) {
                        strN = i0.o.n(parcel, i14);
                    } else if (c12 != 5) {
                        i0.o.O(parcel, i14);
                    } else {
                        int iJ = i0.o.J(parcel, i14);
                        if (iJ == 0) {
                            numValueOf = null;
                        } else {
                            i0.o.X(parcel, iJ, 4);
                            numValueOf = Integer.valueOf(parcel.readInt());
                        }
                    }
                }
                i0.o.v(parcel, iS6);
                return new ma.b(iH3, iH4, pendingIntent, strN, numValueOf);
            case 6:
                int iS7 = i0.o.S(parcel);
                int iH5 = 0;
                boolean zF9 = false;
                long jI3 = -1;
                String strN2 = null;
                while (parcel.dataPosition() < iS7) {
                    int i15 = parcel.readInt();
                    char c13 = (char) i15;
                    if (c13 == 1) {
                        strN2 = i0.o.n(parcel, i15);
                    } else if (c13 == 2) {
                        iH5 = i0.o.H(parcel, i15);
                    } else if (c13 == 3) {
                        jI3 = i0.o.I(parcel, i15);
                    } else if (c13 != 4) {
                        i0.o.O(parcel, i15);
                    } else {
                        zF9 = i0.o.F(parcel, i15);
                    }
                }
                i0.o.v(parcel, iS7);
                return new ma.d(strN2, iH5, jI3, zF9);
            case 7:
                int iS8 = i0.o.S(parcel);
                long jI4 = -1;
                boolean zF10 = false;
                int iH6 = 0;
                int iH7 = 0;
                String strN3 = null;
                while (parcel.dataPosition() < iS8) {
                    int i16 = parcel.readInt();
                    char c14 = (char) i16;
                    if (c14 == 1) {
                        zF10 = i0.o.F(parcel, i16);
                    } else if (c14 == 2) {
                        strN3 = i0.o.n(parcel, i16);
                    } else if (c14 == 3) {
                        iH6 = i0.o.H(parcel, i16);
                    } else if (c14 == 4) {
                        iH7 = i0.o.H(parcel, i16);
                    } else if (c14 != 5) {
                        i0.o.O(parcel, i16);
                    } else {
                        jI4 = i0.o.I(parcel, i16);
                    }
                }
                i0.o.v(parcel, iS8);
                return new t(zF10, strN3, iH6, iH7, jI4);
            case 8:
                int iS9 = i0.o.S(parcel);
                boolean zF11 = false;
                while (parcel.dataPosition() < iS9) {
                    int i17 = parcel.readInt();
                    if (((char) i17) != 1) {
                        i0.o.O(parcel, i17);
                    } else {
                        zF11 = i0.o.F(parcel, i17);
                    }
                }
                i0.o.v(parcel, iS9);
                return new n9.a(zF11);
            case 9:
                int iS10 = i0.o.S(parcel);
                IBinder iBinderG = null;
                boolean zF12 = false;
                IBinder iBinderG2 = null;
                while (parcel.dataPosition() < iS10) {
                    int i18 = parcel.readInt();
                    char c15 = (char) i18;
                    if (c15 == 1) {
                        zF12 = i0.o.F(parcel, i18);
                    } else if (c15 == 2) {
                        iBinderG = i0.o.G(parcel, i18);
                    } else if (c15 != 3) {
                        i0.o.O(parcel, i18);
                    } else {
                        iBinderG2 = i0.o.G(parcel, i18);
                    }
                }
                i0.o.v(parcel, iS10);
                return new n9.d(zF12, iBinderG, iBinderG2);
            case 10:
                int iS11 = i0.o.S(parcel);
                String strN4 = null;
                int iH8 = 0;
                while (parcel.dataPosition() < iS11) {
                    int i19 = parcel.readInt();
                    char c16 = (char) i19;
                    if (c16 == 1) {
                        iH8 = i0.o.H(parcel, i19);
                    } else if (c16 != 2) {
                        i0.o.O(parcel, i19);
                    } else {
                        strN4 = i0.o.n(parcel, i19);
                    }
                }
                i0.o.v(parcel, iS11);
                return new Scope(iH8, strN4);
            case 11:
                int iS12 = i0.o.S(parcel);
                String strN5 = null;
                ma.b bVar = null;
                int iH9 = 0;
                PendingIntent pendingIntent2 = null;
                while (parcel.dataPosition() < iS12) {
                    int i20 = parcel.readInt();
                    char c17 = (char) i20;
                    if (c17 == 1) {
                        iH9 = i0.o.H(parcel, i20);
                    } else if (c17 == 2) {
                        strN5 = i0.o.n(parcel, i20);
                    } else if (c17 == 3) {
                        pendingIntent2 = (PendingIntent) i0.o.m(parcel, i20, PendingIntent.CREATOR);
                    } else if (c17 != 4) {
                        i0.o.O(parcel, i20);
                    } else {
                        bVar = (ma.b) i0.o.m(parcel, i20, ma.b.CREATOR);
                    }
                }
                i0.o.v(parcel, iS12);
                return new Status(iH9, strN5, pendingIntent2, bVar);
            case 12:
                int iS13 = i0.o.S(parcel);
                long jI5 = 0;
                long jI6 = 0;
                int iH10 = 0;
                while (parcel.dataPosition() < iS13) {
                    int i21 = parcel.readInt();
                    char c18 = (char) i21;
                    if (c18 == 1) {
                        jI5 = i0.o.I(parcel, i21);
                    } else if (c18 == 2) {
                        iH10 = i0.o.H(parcel, i21);
                    } else if (c18 != 3) {
                        i0.o.O(parcel, i21);
                    } else {
                        jI6 = i0.o.I(parcel, i21);
                    }
                }
                i0.o.v(parcel, iS13);
                return new ob.d(iH10, jI5, jI6);
            case 13:
                int iS14 = i0.o.S(parcel);
                String strN6 = null;
                String strN7 = null;
                b4 b4Var = null;
                String strN8 = null;
                v vVar = null;
                v vVar2 = null;
                v vVar3 = null;
                long jI7 = 0;
                long jI8 = 0;
                long jI9 = 0;
                boolean zF13 = false;
                while (parcel.dataPosition() < iS14) {
                    int i22 = parcel.readInt();
                    switch ((char) i22) {
                        case 2:
                            strN6 = i0.o.n(parcel, i22);
                            break;
                        case 3:
                            strN7 = i0.o.n(parcel, i22);
                            break;
                        case 4:
                            b4Var = (b4) i0.o.m(parcel, i22, b4.CREATOR);
                            break;
                        case 5:
                            jI7 = i0.o.I(parcel, i22);
                            break;
                        case 6:
                            zF13 = i0.o.F(parcel, i22);
                            break;
                        case 7:
                            strN8 = i0.o.n(parcel, i22);
                            break;
                        case '\b':
                            vVar = (v) i0.o.m(parcel, i22, v.CREATOR);
                            break;
                        case '\t':
                            jI8 = i0.o.I(parcel, i22);
                            break;
                        case '\n':
                            vVar2 = (v) i0.o.m(parcel, i22, v.CREATOR);
                            break;
                        case 11:
                            jI9 = i0.o.I(parcel, i22);
                            break;
                        case '\f':
                            vVar3 = (v) i0.o.m(parcel, i22, v.CREATOR);
                            break;
                        default:
                            i0.o.O(parcel, i22);
                            break;
                    }
                }
                i0.o.v(parcel, iS14);
                return new ob.e(strN6, strN7, b4Var, jI7, zF13, strN8, vVar, jI8, vVar2, jI9, vVar3);
            case 14:
                int iS15 = i0.o.S(parcel);
                Bundle bundleI = null;
                while (parcel.dataPosition() < iS15) {
                    int i23 = parcel.readInt();
                    if (((char) i23) != 1) {
                        i0.o.O(parcel, i23);
                    } else {
                        bundleI = i0.o.i(parcel, i23);
                    }
                }
                i0.o.v(parcel, iS15);
                return new ob.i(bundleI);
            case 15:
                int iS16 = i0.o.S(parcel);
                Bundle bundleI2 = null;
                while (parcel.dataPosition() < iS16) {
                    int i24 = parcel.readInt();
                    if (((char) i24) != 2) {
                        i0.o.O(parcel, i24);
                    } else {
                        bundleI2 = i0.o.i(parcel, i24);
                    }
                }
                i0.o.v(parcel, iS16);
                return new u(bundleI2);
            case 16:
                int iS17 = i0.o.S(parcel);
                long jI10 = 0;
                String strN9 = null;
                u uVar = null;
                String strN10 = null;
                while (parcel.dataPosition() < iS17) {
                    int i25 = parcel.readInt();
                    char c19 = (char) i25;
                    if (c19 == 2) {
                        strN9 = i0.o.n(parcel, i25);
                    } else if (c19 == 3) {
                        uVar = (u) i0.o.m(parcel, i25, u.CREATOR);
                    } else if (c19 == 4) {
                        strN10 = i0.o.n(parcel, i25);
                    } else if (c19 != 5) {
                        i0.o.O(parcel, i25);
                    } else {
                        jI10 = i0.o.I(parcel, i25);
                    }
                }
                i0.o.v(parcel, iS17);
                return new v(strN9, uVar, strN10, jI10);
            case 17:
                int iS18 = i0.o.S(parcel);
                int iH11 = 0;
                long jI11 = 0;
                String strN11 = null;
                while (parcel.dataPosition() < iS18) {
                    int i26 = parcel.readInt();
                    char c20 = (char) i26;
                    if (c20 == 1) {
                        strN11 = i0.o.n(parcel, i26);
                    } else if (c20 == 2) {
                        jI11 = i0.o.I(parcel, i26);
                    } else if (c20 != 3) {
                        i0.o.O(parcel, i26);
                    } else {
                        iH11 = i0.o.H(parcel, i26);
                    }
                }
                i0.o.v(parcel, iS18);
                return new o3(strN11, jI11, iH11);
            case 18:
                int iS19 = i0.o.S(parcel);
                byte[] bArrJ = null;
                String strN12 = null;
                Bundle bundleI3 = null;
                String strN13 = null;
                long jI12 = 0;
                long jI13 = 0;
                int iH12 = 0;
                while (parcel.dataPosition() < iS19) {
                    int i27 = parcel.readInt();
                    switch ((char) i27) {
                        case 1:
                            jI12 = i0.o.I(parcel, i27);
                            break;
                        case 2:
                            bArrJ = i0.o.j(parcel, i27);
                            break;
                        case 3:
                            strN12 = i0.o.n(parcel, i27);
                            break;
                        case 4:
                            bundleI3 = i0.o.i(parcel, i27);
                            break;
                        case 5:
                            iH12 = i0.o.H(parcel, i27);
                            break;
                        case 6:
                            jI13 = i0.o.I(parcel, i27);
                            break;
                        case 7:
                            strN13 = i0.o.n(parcel, i27);
                            break;
                        default:
                            i0.o.O(parcel, i27);
                            break;
                    }
                }
                i0.o.v(parcel, iS19);
                return new r3(jI12, bArrJ, strN12, bundleI3, iH12, jI13, strN13);
            case 19:
                int iS20 = i0.o.S(parcel);
                ArrayList arrayListL = null;
                while (parcel.dataPosition() < iS20) {
                    int i28 = parcel.readInt();
                    if (((char) i28) != 1) {
                        i0.o.O(parcel, i28);
                    } else {
                        arrayListL = i0.o.l(parcel, i28);
                    }
                }
                i0.o.v(parcel, iS20);
                return new s3(arrayListL);
            case 20:
                int iS21 = i0.o.S(parcel);
                ArrayList arrayListR2 = null;
                while (parcel.dataPosition() < iS21) {
                    int i29 = parcel.readInt();
                    if (((char) i29) != 1) {
                        i0.o.O(parcel, i29);
                    } else {
                        arrayListR2 = i0.o.r(parcel, i29, r3.CREATOR);
                    }
                }
                i0.o.v(parcel, iS21);
                return new t3(arrayListR2);
            case 21:
                int iS22 = i0.o.S(parcel);
                String strN14 = null;
                Long lValueOf = null;
                Float fValueOf = null;
                String strN15 = null;
                String strN16 = null;
                Double dValueOf = null;
                long jI14 = 0;
                int iH13 = 0;
                while (parcel.dataPosition() < iS22) {
                    int i30 = parcel.readInt();
                    switch ((char) i30) {
                        case 1:
                            iH13 = i0.o.H(parcel, i30);
                            break;
                        case 2:
                            strN14 = i0.o.n(parcel, i30);
                            break;
                        case 3:
                            jI14 = i0.o.I(parcel, i30);
                            break;
                        case 4:
                            int iJ2 = i0.o.J(parcel, i30);
                            if (iJ2 != 0) {
                                i0.o.X(parcel, iJ2, 8);
                                lValueOf = Long.valueOf(parcel.readLong());
                            } else {
                                lValueOf = null;
                            }
                            break;
                        case 5:
                            int iJ3 = i0.o.J(parcel, i30);
                            if (iJ3 != 0) {
                                i0.o.X(parcel, iJ3, 4);
                                fValueOf = Float.valueOf(parcel.readFloat());
                            } else {
                                fValueOf = null;
                            }
                            break;
                        case 6:
                            strN15 = i0.o.n(parcel, i30);
                            break;
                        case 7:
                            strN16 = i0.o.n(parcel, i30);
                            break;
                        case '\b':
                            int iJ4 = i0.o.J(parcel, i30);
                            if (iJ4 != 0) {
                                i0.o.X(parcel, iJ4, 8);
                                dValueOf = Double.valueOf(parcel.readDouble());
                            } else {
                                dValueOf = null;
                            }
                            break;
                        default:
                            i0.o.O(parcel, i30);
                            break;
                    }
                }
                i0.o.v(parcel, iS22);
                return new b4(iH13, strN14, jI14, lValueOf, fValueOf, strN15, strN16, dValueOf);
            case 22:
                int iS23 = i0.o.S(parcel);
                boolean zF14 = false;
                int iH14 = 0;
                boolean zF15 = false;
                boolean zF16 = false;
                int iH15 = 0;
                int iH16 = 0;
                long jI15 = 0;
                long jI16 = 0;
                long jI17 = 0;
                long jI18 = 0;
                long jI19 = 0;
                long jI20 = 0;
                long jI21 = 0;
                String strN17 = "";
                String strN18 = strN17;
                String strN19 = strN18;
                String strN20 = strN19;
                String strN21 = null;
                String strN22 = null;
                String strN23 = null;
                String strN24 = null;
                String strN25 = null;
                String strN26 = null;
                Boolean boolValueOf = null;
                ArrayList arrayListP = null;
                String strN27 = null;
                String strN28 = null;
                int iH17 = 100;
                boolean zF17 = true;
                boolean zF18 = true;
                long jI22 = -2147483648L;
                while (parcel.dataPosition() < iS23) {
                    int i31 = parcel.readInt();
                    switch ((char) i31) {
                        case 2:
                            strN21 = i0.o.n(parcel, i31);
                            break;
                        case 3:
                            strN22 = i0.o.n(parcel, i31);
                            break;
                        case 4:
                            strN23 = i0.o.n(parcel, i31);
                            break;
                        case 5:
                            strN24 = i0.o.n(parcel, i31);
                            break;
                        case 6:
                            jI15 = i0.o.I(parcel, i31);
                            break;
                        case 7:
                            jI16 = i0.o.I(parcel, i31);
                            break;
                        case '\b':
                            strN25 = i0.o.n(parcel, i31);
                            break;
                        case '\t':
                            zF17 = i0.o.F(parcel, i31);
                            break;
                        case '\n':
                            zF14 = i0.o.F(parcel, i31);
                            break;
                        case 11:
                            jI22 = i0.o.I(parcel, i31);
                            break;
                        case '\f':
                            strN26 = i0.o.n(parcel, i31);
                            break;
                        case '\r':
                        case 17:
                        case 19:
                        case 20:
                        case 24:
                        case '!':
                        default:
                            i0.o.O(parcel, i31);
                            break;
                        case 14:
                            jI17 = i0.o.I(parcel, i31);
                            break;
                        case 15:
                            iH14 = i0.o.H(parcel, i31);
                            break;
                        case 16:
                            zF18 = i0.o.F(parcel, i31);
                            break;
                        case 18:
                            zF15 = i0.o.F(parcel, i31);
                            break;
                        case 21:
                            int iJ5 = i0.o.J(parcel, i31);
                            if (iJ5 != 0) {
                                i0.o.X(parcel, iJ5, 4);
                                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                            } else {
                                boolValueOf = null;
                            }
                            break;
                        case 22:
                            jI18 = i0.o.I(parcel, i31);
                            break;
                        case 23:
                            arrayListP = i0.o.p(parcel, i31);
                            break;
                        case 25:
                            strN17 = i0.o.n(parcel, i31);
                            break;
                        case 26:
                            strN18 = i0.o.n(parcel, i31);
                            break;
                        case 27:
                            strN27 = i0.o.n(parcel, i31);
                            break;
                        case 28:
                            zF16 = i0.o.F(parcel, i31);
                            break;
                        case 29:
                            jI19 = i0.o.I(parcel, i31);
                            break;
                        case 30:
                            iH17 = i0.o.H(parcel, i31);
                            break;
                        case 31:
                            strN19 = i0.o.n(parcel, i31);
                            break;
                        case ' ':
                            iH15 = i0.o.H(parcel, i31);
                            break;
                        case '\"':
                            jI20 = i0.o.I(parcel, i31);
                            break;
                        case '#':
                            strN28 = i0.o.n(parcel, i31);
                            break;
                        case '$':
                            strN20 = i0.o.n(parcel, i31);
                            break;
                        case '%':
                            jI21 = i0.o.I(parcel, i31);
                            break;
                        case '&':
                            iH16 = i0.o.H(parcel, i31);
                            break;
                    }
                }
                i0.o.v(parcel, iS23);
                return new g4(strN21, strN22, strN23, strN24, jI15, jI16, strN25, zF17, zF14, jI22, strN26, jI17, iH14, zF18, zF15, boolValueOf, jI18, arrayListP, strN17, strN18, strN27, zF16, jI19, iH17, strN19, iH15, jI20, strN28, strN20, jI21, iH16);
            case 23:
                int iS24 = i0.o.S(parcel);
                boolean zF19 = false;
                boolean zF20 = false;
                boolean zF21 = false;
                int iH18 = 0;
                boolean zF22 = false;
                boolean zF23 = false;
                boolean zF24 = false;
                float f10 = 0.0f;
                String strN29 = null;
                while (parcel.dataPosition() < iS24) {
                    int i32 = parcel.readInt();
                    switch ((char) i32) {
                        case 2:
                            zF19 = i0.o.F(parcel, i32);
                            break;
                        case 3:
                            zF20 = i0.o.F(parcel, i32);
                            break;
                        case 4:
                            strN29 = i0.o.n(parcel, i32);
                            break;
                        case 5:
                            zF21 = i0.o.F(parcel, i32);
                            break;
                        case 6:
                            i0.o.W(parcel, i32, 4);
                            f10 = parcel.readFloat();
                            break;
                        case 7:
                            iH18 = i0.o.H(parcel, i32);
                            break;
                        case '\b':
                            zF22 = i0.o.F(parcel, i32);
                            break;
                        case '\t':
                            zF23 = i0.o.F(parcel, i32);
                            break;
                        case '\n':
                            zF24 = i0.o.F(parcel, i32);
                            break;
                        default:
                            i0.o.O(parcel, i32);
                            break;
                    }
                }
                i0.o.v(parcel, iS24);
                return new p9.f(zF19, zF20, strN29, zF21, f10, iH18, zF22, zF23, zF24);
            case 24:
                int iS25 = i0.o.S(parcel);
                String strN30 = null;
                int iH19 = 0;
                while (parcel.dataPosition() < iS25) {
                    int i33 = parcel.readInt();
                    char c21 = (char) i33;
                    if (c21 == 1) {
                        iH19 = i0.o.H(parcel, i33);
                    } else if (c21 != 2) {
                        i0.o.O(parcel, i33);
                    } else {
                        strN30 = i0.o.n(parcel, i33);
                    }
                }
                i0.o.v(parcel, iS25);
                return new pa.f(iH19, strN30);
            case 25:
                int iS26 = i0.o.S(parcel);
                ArrayList arrayListR3 = null;
                int iH20 = 0;
                while (parcel.dataPosition() < iS26) {
                    int i34 = parcel.readInt();
                    char c22 = (char) i34;
                    if (c22 == 1) {
                        iH20 = i0.o.H(parcel, i34);
                    } else if (c22 != 2) {
                        i0.o.O(parcel, i34);
                    } else {
                        arrayListR3 = i0.o.r(parcel, i34, pa.k.CREATOR);
                    }
                }
                i0.o.v(parcel, iS26);
                return new pa.o(iH20, arrayListR3);
            case 26:
                int iS27 = i0.o.S(parcel);
                int iH21 = -1;
                int iH22 = 0;
                int iH23 = 0;
                int iH24 = 0;
                int iH25 = 0;
                String strN31 = null;
                String strN32 = null;
                long jI23 = 0;
                long jI24 = 0;
                while (parcel.dataPosition() < iS27) {
                    int i35 = parcel.readInt();
                    switch ((char) i35) {
                        case 1:
                            iH22 = i0.o.H(parcel, i35);
                            break;
                        case 2:
                            iH23 = i0.o.H(parcel, i35);
                            break;
                        case 3:
                            iH24 = i0.o.H(parcel, i35);
                            break;
                        case 4:
                            jI23 = i0.o.I(parcel, i35);
                            break;
                        case 5:
                            jI24 = i0.o.I(parcel, i35);
                            break;
                        case 6:
                            strN31 = i0.o.n(parcel, i35);
                            break;
                        case 7:
                            strN32 = i0.o.n(parcel, i35);
                            break;
                        case '\b':
                            iH25 = i0.o.H(parcel, i35);
                            break;
                        case '\t':
                            iH21 = i0.o.H(parcel, i35);
                            break;
                        default:
                            i0.o.O(parcel, i35);
                            break;
                    }
                }
                i0.o.v(parcel, iS27);
                return new pa.k(iH22, iH23, iH24, jI23, jI24, strN31, strN32, iH25, iH21);
            case 27:
                int iS28 = i0.o.S(parcel);
                Account account = null;
                int iH26 = 0;
                int iH27 = 0;
                GoogleSignInAccount googleSignInAccount = null;
                while (parcel.dataPosition() < iS28) {
                    int i36 = parcel.readInt();
                    char c23 = (char) i36;
                    if (c23 == 1) {
                        iH26 = i0.o.H(parcel, i36);
                    } else if (c23 == 2) {
                        account = (Account) i0.o.m(parcel, i36, Account.CREATOR);
                    } else if (c23 == 3) {
                        iH27 = i0.o.H(parcel, i36);
                    } else if (c23 != 4) {
                        i0.o.O(parcel, i36);
                    } else {
                        googleSignInAccount = (GoogleSignInAccount) i0.o.m(parcel, i36, GoogleSignInAccount.CREATOR);
                    }
                }
                i0.o.v(parcel, iS28);
                return new pa.v(iH26, account, iH27, googleSignInAccount);
            case 28:
                int iS29 = i0.o.S(parcel);
                int iH28 = 0;
                boolean zF25 = false;
                boolean zF26 = false;
                IBinder iBinderG3 = null;
                ma.b bVar2 = null;
                while (parcel.dataPosition() < iS29) {
                    int i37 = parcel.readInt();
                    char c24 = (char) i37;
                    if (c24 == 1) {
                        iH28 = i0.o.H(parcel, i37);
                    } else if (c24 == 2) {
                        iBinderG3 = i0.o.G(parcel, i37);
                    } else if (c24 == 3) {
                        bVar2 = (ma.b) i0.o.m(parcel, i37, ma.b.CREATOR);
                    } else if (c24 == 4) {
                        zF25 = i0.o.F(parcel, i37);
                    } else if (c24 != 5) {
                        i0.o.O(parcel, i37);
                    } else {
                        zF26 = i0.o.F(parcel, i37);
                    }
                }
                i0.o.v(parcel, iS29);
                return new w(iH28, iBinderG3, bVar2, zF25, zF26);
            default:
                int iS30 = i0.o.S(parcel);
                int iH29 = 0;
                int iH30 = 0;
                int iH31 = 0;
                boolean zF27 = false;
                boolean zF28 = false;
                while (parcel.dataPosition() < iS30) {
                    int i38 = parcel.readInt();
                    char c25 = (char) i38;
                    if (c25 == 1) {
                        iH29 = i0.o.H(parcel, i38);
                    } else if (c25 == 2) {
                        zF27 = i0.o.F(parcel, i38);
                    } else if (c25 == 3) {
                        zF28 = i0.o.F(parcel, i38);
                    } else if (c25 == 4) {
                        iH30 = i0.o.H(parcel, i38);
                    } else if (c25 != 5) {
                        i0.o.O(parcel, i38);
                    } else {
                        iH31 = i0.o.H(parcel, i38);
                    }
                }
                i0.o.v(parcel, iS30);
                return new pa.n(iH29, iH30, iH31, zF27, zF28);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.f27345a) {
            case 0:
                return new e[i];
            case 1:
                return new g[i];
            case 2:
                return new h[i];
            case 3:
                return new k[i];
            case 4:
                return new LatLng[i];
            case 5:
                return new ma.b[i];
            case 6:
                return new ma.d[i];
            case 7:
                return new t[i];
            case 8:
                return new n9.a[i];
            case 9:
                return new n9.d[i];
            case 10:
                return new Scope[i];
            case 11:
                return new Status[i];
            case 12:
                return new ob.d[i];
            case 13:
                return new ob.e[i];
            case 14:
                return new ob.i[i];
            case 15:
                return new u[i];
            case 16:
                return new v[i];
            case 17:
                return new o3[i];
            case 18:
                return new r3[i];
            case 19:
                return new s3[i];
            case 20:
                return new t3[i];
            case 21:
                return new b4[i];
            case 22:
                return new g4[i];
            case 23:
                return new p9.f[i];
            case 24:
                return new pa.f[i];
            case 25:
                return new pa.o[i];
            case 26:
                return new pa.k[i];
            case 27:
                return new pa.v[i];
            case 28:
                return new w[i];
            default:
                return new pa.n[i];
        }
    }
}
