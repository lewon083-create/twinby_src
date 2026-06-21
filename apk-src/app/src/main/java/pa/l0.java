package pa;

import android.accounts.Account;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.identity.intents.model.UserAddress;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.wallet.FullWallet;
import com.google.android.gms.wallet.MaskedWallet;
import com.google.android.gms.wallet.wobs.CommonWalletObject;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class l0 implements Parcelable.Creator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31395a;

    public /* synthetic */ l0(int i) {
        this.f31395a = i;
    }

    public static void a(h hVar, Parcel parcel, int i) {
        int iI0 = j0.g.i0(parcel, 20293);
        int i10 = hVar.f31364b;
        j0.g.h0(parcel, 1, 4);
        parcel.writeInt(i10);
        int i11 = hVar.f31365c;
        j0.g.h0(parcel, 2, 4);
        parcel.writeInt(i11);
        int i12 = hVar.f31366d;
        j0.g.h0(parcel, 3, 4);
        parcel.writeInt(i12);
        j0.g.b0(parcel, 4, hVar.f31367e);
        j0.g.X(parcel, 5, hVar.f31368f);
        j0.g.e0(parcel, 6, hVar.f31369g, i);
        j0.g.V(parcel, 7, hVar.f31370h);
        j0.g.a0(parcel, 8, hVar.i, i);
        j0.g.e0(parcel, 10, hVar.f31371j, i);
        j0.g.e0(parcel, 11, hVar.f31372k, i);
        boolean z5 = hVar.f31373l;
        j0.g.h0(parcel, 12, 4);
        parcel.writeInt(z5 ? 1 : 0);
        int i13 = hVar.f31374m;
        j0.g.h0(parcel, 13, 4);
        parcel.writeInt(i13);
        boolean z10 = hVar.f31375n;
        j0.g.h0(parcel, 14, 4);
        parcel.writeInt(z10 ? 1 : 0);
        j0.g.b0(parcel, 15, hVar.f31376o);
        j0.g.m0(parcel, iI0);
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f31395a) {
            case 0:
                int iS = i0.o.S(parcel);
                Bundle bundleI = null;
                g gVar = null;
                int iH = 0;
                ma.d[] dVarArr = null;
                while (parcel.dataPosition() < iS) {
                    int i = parcel.readInt();
                    char c8 = (char) i;
                    if (c8 == 1) {
                        bundleI = i0.o.i(parcel, i);
                    } else if (c8 == 2) {
                        dVarArr = (ma.d[]) i0.o.q(parcel, i, ma.d.CREATOR);
                    } else if (c8 == 3) {
                        iH = i0.o.H(parcel, i);
                    } else if (c8 != 4) {
                        i0.o.O(parcel, i);
                    } else {
                        gVar = (g) i0.o.m(parcel, i, g.CREATOR);
                    }
                }
                i0.o.v(parcel, iS);
                k0 k0Var = new k0();
                k0Var.f31391b = bundleI;
                k0Var.f31392c = dVarArr;
                k0Var.f31393d = iH;
                k0Var.f31394e = gVar;
                return k0Var;
            case 1:
                int iS2 = i0.o.S(parcel);
                n nVar = null;
                int[] iArrK = null;
                int[] iArrK2 = null;
                boolean zF = false;
                boolean zF2 = false;
                int iH2 = 0;
                while (parcel.dataPosition() < iS2) {
                    int i10 = parcel.readInt();
                    switch ((char) i10) {
                        case 1:
                            nVar = (n) i0.o.m(parcel, i10, n.CREATOR);
                            break;
                        case 2:
                            zF = i0.o.F(parcel, i10);
                            break;
                        case 3:
                            zF2 = i0.o.F(parcel, i10);
                            break;
                        case 4:
                            iArrK = i0.o.k(parcel, i10);
                            break;
                        case 5:
                            iH2 = i0.o.H(parcel, i10);
                            break;
                        case 6:
                            iArrK2 = i0.o.k(parcel, i10);
                            break;
                        default:
                            i0.o.O(parcel, i10);
                            break;
                    }
                }
                i0.o.v(parcel, iS2);
                return new g(nVar, zF, zF2, iArrK, iH2, iArrK2);
            case 2:
                int iS3 = i0.o.S(parcel);
                Bundle bundle = new Bundle();
                Scope[] scopeArr = h.f31362p;
                String strN = null;
                IBinder iBinderG = null;
                Account account = null;
                String strN2 = null;
                int iH3 = 0;
                int iH4 = 0;
                int iH5 = 0;
                boolean zF3 = false;
                int iH6 = 0;
                boolean zF4 = false;
                ma.d[] dVarArr2 = h.f31363q;
                ma.d[] dVarArr3 = dVarArr2;
                while (parcel.dataPosition() < iS3) {
                    int i11 = parcel.readInt();
                    switch ((char) i11) {
                        case 1:
                            iH3 = i0.o.H(parcel, i11);
                            break;
                        case 2:
                            iH4 = i0.o.H(parcel, i11);
                            break;
                        case 3:
                            iH5 = i0.o.H(parcel, i11);
                            break;
                        case 4:
                            strN = i0.o.n(parcel, i11);
                            break;
                        case 5:
                            iBinderG = i0.o.G(parcel, i11);
                            break;
                        case 6:
                            scopeArr = (Scope[]) i0.o.q(parcel, i11, Scope.CREATOR);
                            break;
                        case 7:
                            bundle = i0.o.i(parcel, i11);
                            break;
                        case '\b':
                            account = (Account) i0.o.m(parcel, i11, Account.CREATOR);
                            break;
                        case '\t':
                        default:
                            i0.o.O(parcel, i11);
                            break;
                        case '\n':
                            dVarArr2 = (ma.d[]) i0.o.q(parcel, i11, ma.d.CREATOR);
                            break;
                        case 11:
                            dVarArr3 = (ma.d[]) i0.o.q(parcel, i11, ma.d.CREATOR);
                            break;
                        case '\f':
                            zF3 = i0.o.F(parcel, i11);
                            break;
                        case '\r':
                            iH6 = i0.o.H(parcel, i11);
                            break;
                        case 14:
                            zF4 = i0.o.F(parcel, i11);
                            break;
                        case 15:
                            strN2 = i0.o.n(parcel, i11);
                            break;
                    }
                }
                i0.o.v(parcel, iS3);
                return new h(iH3, iH4, iH5, strN, iBinderG, scopeArr, bundle, account, dVarArr2, dVarArr3, zF3, iH6, zF4, strN2);
            case 3:
                int iS4 = i0.o.S(parcel);
                Intent intent = null;
                int iH7 = 0;
                int iH8 = 0;
                while (parcel.dataPosition() < iS4) {
                    int i12 = parcel.readInt();
                    char c9 = (char) i12;
                    if (c9 == 1) {
                        iH7 = i0.o.H(parcel, i12);
                    } else if (c9 == 2) {
                        iH8 = i0.o.H(parcel, i12);
                    } else if (c9 != 3) {
                        i0.o.O(parcel, i12);
                    } else {
                        intent = (Intent) i0.o.m(parcel, i12, Intent.CREATOR);
                    }
                }
                i0.o.v(parcel, iS4);
                return new qb.b(iH7, iH8, intent);
            case 4:
                int iS5 = i0.o.S(parcel);
                ArrayList arrayListP = null;
                String strN3 = null;
                while (parcel.dataPosition() < iS5) {
                    int i13 = parcel.readInt();
                    char c10 = (char) i13;
                    if (c10 == 1) {
                        arrayListP = i0.o.p(parcel, i13);
                    } else if (c10 != 2) {
                        i0.o.O(parcel, i13);
                    } else {
                        strN3 = i0.o.n(parcel, i13);
                    }
                }
                i0.o.v(parcel, iS5);
                return new qb.e(strN3, arrayListP);
            case 5:
                int iS6 = i0.o.S(parcel);
                ma.b bVar = null;
                int iH9 = 0;
                w wVar = null;
                while (parcel.dataPosition() < iS6) {
                    int i14 = parcel.readInt();
                    char c11 = (char) i14;
                    if (c11 == 1) {
                        iH9 = i0.o.H(parcel, i14);
                    } else if (c11 == 2) {
                        bVar = (ma.b) i0.o.m(parcel, i14, ma.b.CREATOR);
                    } else if (c11 != 3) {
                        i0.o.O(parcel, i14);
                    } else {
                        wVar = (w) i0.o.m(parcel, i14, w.CREATOR);
                    }
                }
                i0.o.v(parcel, iS6);
                return new qb.f(iH9, bVar, wVar);
            case 6:
                int iS7 = i0.o.S(parcel);
                String strN4 = null;
                String strN5 = null;
                String strN6 = null;
                while (parcel.dataPosition() < iS7) {
                    int i15 = parcel.readInt();
                    char c12 = (char) i15;
                    if (c12 == 1) {
                        strN4 = i0.o.n(parcel, i15);
                    } else if (c12 == 2) {
                        strN5 = i0.o.n(parcel, i15);
                    } else if (c12 != 3) {
                        i0.o.O(parcel, i15);
                    } else {
                        strN6 = i0.o.n(parcel, i15);
                    }
                }
                i0.o.v(parcel, iS7);
                return new r9.a(strN4, strN5, strN6);
            case 7:
                int iS8 = i0.o.S(parcel);
                String strN7 = null;
                String strN8 = null;
                String strN9 = null;
                String strN10 = null;
                String strN11 = null;
                String strN12 = null;
                String strN13 = null;
                Intent intent2 = null;
                IBinder iBinderG2 = null;
                Bundle bundleI2 = null;
                boolean zF5 = false;
                while (parcel.dataPosition() < iS8) {
                    int i16 = parcel.readInt();
                    switch ((char) i16) {
                        case 2:
                            strN7 = i0.o.n(parcel, i16);
                            break;
                        case 3:
                            strN8 = i0.o.n(parcel, i16);
                            break;
                        case 4:
                            strN9 = i0.o.n(parcel, i16);
                            break;
                        case 5:
                            strN10 = i0.o.n(parcel, i16);
                            break;
                        case 6:
                            strN11 = i0.o.n(parcel, i16);
                            break;
                        case 7:
                            strN12 = i0.o.n(parcel, i16);
                            break;
                        case '\b':
                            strN13 = i0.o.n(parcel, i16);
                            break;
                        case '\t':
                            intent2 = (Intent) i0.o.m(parcel, i16, Intent.CREATOR);
                            break;
                        case '\n':
                            iBinderG2 = i0.o.G(parcel, i16);
                            break;
                        case 11:
                            zF5 = i0.o.F(parcel, i16);
                            break;
                        case '\f':
                            bundleI2 = i0.o.i(parcel, i16);
                            break;
                        default:
                            i0.o.O(parcel, i16);
                            break;
                    }
                }
                i0.o.v(parcel, iS8);
                return new s9.e(strN7, strN8, strN9, strN10, strN11, strN12, strN13, intent2, iBinderG2, zF5, bundleI2);
            case 8:
                int iS9 = i0.o.S(parcel);
                long jI = 0;
                boolean zF6 = false;
                int iH10 = 0;
                int iH11 = 0;
                boolean zF7 = false;
                s9.e eVar = null;
                IBinder iBinderG3 = null;
                IBinder iBinderG4 = null;
                IBinder iBinderG5 = null;
                IBinder iBinderG6 = null;
                String strN14 = null;
                String strN15 = null;
                IBinder iBinderG7 = null;
                String strN16 = null;
                u9.a aVar = null;
                String strN17 = null;
                p9.f fVar = null;
                IBinder iBinderG8 = null;
                String strN18 = null;
                String strN19 = null;
                String strN20 = null;
                IBinder iBinderG9 = null;
                IBinder iBinderG10 = null;
                IBinder iBinderG11 = null;
                while (parcel.dataPosition() < iS9) {
                    int i17 = parcel.readInt();
                    switch ((char) i17) {
                        case 2:
                            eVar = (s9.e) i0.o.m(parcel, i17, s9.e.CREATOR);
                            break;
                        case 3:
                            iBinderG3 = i0.o.G(parcel, i17);
                            break;
                        case 4:
                            iBinderG4 = i0.o.G(parcel, i17);
                            break;
                        case 5:
                            iBinderG5 = i0.o.G(parcel, i17);
                            break;
                        case 6:
                            iBinderG6 = i0.o.G(parcel, i17);
                            break;
                        case 7:
                            strN14 = i0.o.n(parcel, i17);
                            break;
                        case '\b':
                            zF6 = i0.o.F(parcel, i17);
                            break;
                        case '\t':
                            strN15 = i0.o.n(parcel, i17);
                            break;
                        case '\n':
                            iBinderG7 = i0.o.G(parcel, i17);
                            break;
                        case 11:
                            iH10 = i0.o.H(parcel, i17);
                            break;
                        case '\f':
                            iH11 = i0.o.H(parcel, i17);
                            break;
                        case '\r':
                            strN16 = i0.o.n(parcel, i17);
                            break;
                        case 14:
                            aVar = (u9.a) i0.o.m(parcel, i17, u9.a.CREATOR);
                            break;
                        case 15:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        default:
                            i0.o.O(parcel, i17);
                            break;
                        case 16:
                            strN17 = i0.o.n(parcel, i17);
                            break;
                        case 17:
                            fVar = (p9.f) i0.o.m(parcel, i17, p9.f.CREATOR);
                            break;
                        case 18:
                            iBinderG8 = i0.o.G(parcel, i17);
                            break;
                        case 19:
                            strN18 = i0.o.n(parcel, i17);
                            break;
                        case 24:
                            strN19 = i0.o.n(parcel, i17);
                            break;
                        case 25:
                            strN20 = i0.o.n(parcel, i17);
                            break;
                        case 26:
                            iBinderG9 = i0.o.G(parcel, i17);
                            break;
                        case 27:
                            iBinderG10 = i0.o.G(parcel, i17);
                            break;
                        case 28:
                            iBinderG11 = i0.o.G(parcel, i17);
                            break;
                        case 29:
                            zF7 = i0.o.F(parcel, i17);
                            break;
                        case 30:
                            jI = i0.o.I(parcel, i17);
                            break;
                    }
                }
                i0.o.v(parcel, iS9);
                return new AdOverlayInfoParcel(eVar, iBinderG3, iBinderG4, iBinderG5, iBinderG6, strN14, zF6, strN15, iBinderG7, iH10, iH11, strN16, aVar, strN17, fVar, iBinderG8, strN18, strN19, strN20, iBinderG9, iBinderG10, iBinderG11, zF7, jI);
            case 9:
                int iS10 = i0.o.S(parcel);
                int iH12 = 0;
                String strN21 = null;
                while (parcel.dataPosition() < iS10) {
                    int i18 = parcel.readInt();
                    char c13 = (char) i18;
                    if (c13 == 1) {
                        strN21 = i0.o.n(parcel, i18);
                    } else if (c13 != 2) {
                        i0.o.O(parcel, i18);
                    } else {
                        iH12 = i0.o.H(parcel, i18);
                    }
                }
                i0.o.v(parcel, iS10);
                return new t9.o(strN21, iH12);
            case 10:
                int iS11 = i0.o.S(parcel);
                String strN22 = null;
                int iH13 = 0;
                int iH14 = 0;
                String strN23 = null;
                while (parcel.dataPosition() < iS11) {
                    int i19 = parcel.readInt();
                    char c14 = (char) i19;
                    if (c14 == 2) {
                        strN22 = i0.o.n(parcel, i19);
                    } else if (c14 == 3) {
                        strN23 = i0.o.n(parcel, i19);
                    } else if (c14 == 4) {
                        iH13 = i0.o.H(parcel, i19);
                    } else if (c14 != 5) {
                        i0.o.O(parcel, i19);
                    } else {
                        iH14 = i0.o.H(parcel, i19);
                    }
                }
                i0.o.v(parcel, iS11);
                tb.t tVar = new tb.t();
                tVar.f33757b = strN22;
                tVar.f33758c = strN23;
                tVar.f33759d = iH13;
                tVar.f33760e = iH14;
                return tVar;
            case 11:
                int iS12 = i0.o.S(parcel);
                ArrayList arrayListP2 = null;
                while (parcel.dataPosition() < iS12) {
                    int i20 = parcel.readInt();
                    if (((char) i20) != 1) {
                        i0.o.O(parcel, i20);
                    } else {
                        arrayListP2 = i0.o.p(parcel, i20);
                    }
                }
                i0.o.v(parcel, iS12);
                tb.o oVar = new tb.o();
                oVar.f33739b = arrayListP2;
                return oVar;
            case 12:
                int iS13 = i0.o.S(parcel);
                int iH15 = 0;
                String strN24 = null;
                String strN25 = null;
                while (parcel.dataPosition() < iS13) {
                    int i21 = parcel.readInt();
                    char c15 = (char) i21;
                    if (c15 == 1) {
                        iH15 = i0.o.H(parcel, i21);
                    } else if (c15 == 2) {
                        strN24 = i0.o.n(parcel, i21);
                    } else if (c15 != 3) {
                        i0.o.O(parcel, i21);
                    } else {
                        strN25 = i0.o.n(parcel, i21);
                    }
                }
                i0.o.v(parcel, iS13);
                tb.p pVar = new tb.p();
                pVar.f33740b = iH15;
                pVar.f33741c = strN24;
                pVar.f33742d = strN25;
                return pVar;
            case 13:
                int iS14 = i0.o.S(parcel);
                String strN26 = null;
                Bundle bundleI3 = null;
                while (parcel.dataPosition() < iS14) {
                    int i22 = parcel.readInt();
                    char c16 = (char) i22;
                    if (c16 == 2) {
                        strN26 = i0.o.n(parcel, i22);
                    } else if (c16 != 3) {
                        i0.o.O(parcel, i22);
                    } else {
                        bundleI3 = i0.o.i(parcel, i22);
                    }
                }
                i0.o.v(parcel, iS14);
                tb.u uVar = new tb.u();
                uVar.f33761b = strN26;
                uVar.f33762c = bundleI3;
                return uVar;
            case 14:
                int iS15 = i0.o.S(parcel);
                String strN27 = null;
                String strN28 = null;
                String strN29 = null;
                String strN30 = null;
                String strN31 = null;
                String strN32 = null;
                String strN33 = null;
                String strN34 = null;
                String strN35 = null;
                boolean zF8 = false;
                String strN36 = null;
                while (parcel.dataPosition() < iS15) {
                    int i23 = parcel.readInt();
                    switch ((char) i23) {
                        case 2:
                            strN27 = i0.o.n(parcel, i23);
                            break;
                        case 3:
                            strN36 = i0.o.n(parcel, i23);
                            break;
                        case 4:
                            strN28 = i0.o.n(parcel, i23);
                            break;
                        case 5:
                            strN29 = i0.o.n(parcel, i23);
                            break;
                        case 6:
                            strN30 = i0.o.n(parcel, i23);
                            break;
                        case 7:
                            strN31 = i0.o.n(parcel, i23);
                            break;
                        case '\b':
                            strN32 = i0.o.n(parcel, i23);
                            break;
                        case '\t':
                            strN33 = i0.o.n(parcel, i23);
                            break;
                        case '\n':
                            strN34 = i0.o.n(parcel, i23);
                            break;
                        case 11:
                            zF8 = i0.o.F(parcel, i23);
                            break;
                        case '\f':
                            strN35 = i0.o.n(parcel, i23);
                            break;
                        default:
                            i0.o.O(parcel, i23);
                            break;
                    }
                }
                i0.o.v(parcel, iS15);
                tb.s sVar = new tb.s();
                sVar.f33747b = strN27;
                sVar.f33748c = strN36;
                sVar.f33749d = strN28;
                sVar.f33750e = strN29;
                sVar.f33751f = strN30;
                sVar.f33752g = strN31;
                sVar.f33753h = strN32;
                sVar.i = strN33;
                sVar.f33754j = strN34;
                sVar.f33755k = zF8;
                sVar.f33756l = strN35;
                return sVar;
            case 15:
                int iS16 = i0.o.S(parcel);
                String strN37 = null;
                String strN38 = null;
                UserAddress userAddress = null;
                int iH16 = 0;
                String strN39 = null;
                while (parcel.dataPosition() < iS16) {
                    int i24 = parcel.readInt();
                    char c17 = (char) i24;
                    if (c17 == 1) {
                        strN37 = i0.o.n(parcel, i24);
                    } else if (c17 == 2) {
                        strN39 = i0.o.n(parcel, i24);
                    } else if (c17 == 3) {
                        strN38 = i0.o.n(parcel, i24);
                    } else if (c17 == 4) {
                        iH16 = i0.o.H(parcel, i24);
                    } else if (c17 != 5) {
                        i0.o.O(parcel, i24);
                    } else {
                        userAddress = (UserAddress) i0.o.m(parcel, i24, UserAddress.CREATOR);
                    }
                }
                i0.o.v(parcel, iS16);
                tb.d dVar = new tb.d();
                dVar.f33676b = strN37;
                dVar.f33677c = strN39;
                dVar.f33678d = strN38;
                dVar.f33679e = iH16;
                dVar.f33680f = userAddress;
                return dVar;
            case 16:
                int iS17 = i0.o.S(parcel);
                ArrayList arrayListL = null;
                boolean zF9 = false;
                boolean zF10 = true;
                int iH17 = 0;
                while (parcel.dataPosition() < iS17) {
                    int i25 = parcel.readInt();
                    char c18 = (char) i25;
                    if (c18 == 1) {
                        arrayListL = i0.o.l(parcel, i25);
                    } else if (c18 == 2) {
                        zF10 = i0.o.F(parcel, i25);
                    } else if (c18 == 3) {
                        zF9 = i0.o.F(parcel, i25);
                    } else if (c18 != 4) {
                        i0.o.O(parcel, i25);
                    } else {
                        iH17 = i0.o.H(parcel, i25);
                    }
                }
                i0.o.v(parcel, iS17);
                tb.e eVar2 = new tb.e();
                eVar2.f33681b = arrayListL;
                eVar2.f33682c = zF10;
                eVar2.f33683d = zF9;
                eVar2.f33684e = iH17;
                return eVar2;
            case 17:
                int iS18 = i0.o.S(parcel);
                String strN40 = null;
                String strN41 = null;
                tb.t tVar2 = null;
                String strN42 = null;
                tb.s sVar2 = null;
                tb.s sVar3 = null;
                String[] strArrO = null;
                UserAddress userAddress2 = null;
                UserAddress userAddress3 = null;
                tb.f[] fVarArr = null;
                tb.l lVar = null;
                while (parcel.dataPosition() < iS18) {
                    int i26 = parcel.readInt();
                    switch ((char) i26) {
                        case 2:
                            strN40 = i0.o.n(parcel, i26);
                            break;
                        case 3:
                            strN41 = i0.o.n(parcel, i26);
                            break;
                        case 4:
                            tVar2 = (tb.t) i0.o.m(parcel, i26, tb.t.CREATOR);
                            break;
                        case 5:
                            strN42 = i0.o.n(parcel, i26);
                            break;
                        case 6:
                            sVar2 = (tb.s) i0.o.m(parcel, i26, tb.s.CREATOR);
                            break;
                        case 7:
                            sVar3 = (tb.s) i0.o.m(parcel, i26, tb.s.CREATOR);
                            break;
                        case '\b':
                            strArrO = i0.o.o(parcel, i26);
                            break;
                        case '\t':
                            userAddress2 = (UserAddress) i0.o.m(parcel, i26, UserAddress.CREATOR);
                            break;
                        case '\n':
                            userAddress3 = (UserAddress) i0.o.m(parcel, i26, UserAddress.CREATOR);
                            break;
                        case 11:
                            fVarArr = (tb.f[]) i0.o.q(parcel, i26, tb.f.CREATOR);
                            break;
                        case '\f':
                            lVar = (tb.l) i0.o.m(parcel, i26, tb.l.CREATOR);
                            break;
                        default:
                            i0.o.O(parcel, i26);
                            break;
                    }
                }
                i0.o.v(parcel, iS18);
                FullWallet fullWallet = new FullWallet();
                fullWallet.f14424b = strN40;
                fullWallet.f14425c = strN41;
                fullWallet.f14426d = tVar2;
                fullWallet.f14427e = strN42;
                fullWallet.f14428f = sVar2;
                fullWallet.f14429g = sVar3;
                fullWallet.f14430h = strArrO;
                fullWallet.i = userAddress2;
                fullWallet.f14431j = userAddress3;
                fullWallet.f14432k = fVarArr;
                fullWallet.f14433l = lVar;
                return fullWallet;
            case 18:
                int iS19 = i0.o.S(parcel);
                String strN43 = null;
                int iH18 = 0;
                String strN44 = null;
                while (parcel.dataPosition() < iS19) {
                    int i27 = parcel.readInt();
                    char c19 = (char) i27;
                    if (c19 == 2) {
                        strN43 = i0.o.n(parcel, i27);
                    } else if (c19 == 3) {
                        strN44 = i0.o.n(parcel, i27);
                    } else if (c19 != 4) {
                        i0.o.O(parcel, i27);
                    } else {
                        iH18 = i0.o.H(parcel, i27);
                    }
                }
                i0.o.v(parcel, iS19);
                tb.f fVar2 = new tb.f();
                fVar2.f33685b = strN43;
                fVar2.f33686c = strN44;
                fVar2.f33687d = iH18;
                return fVar2;
            case 19:
                int iS20 = i0.o.S(parcel);
                ArrayList arrayListL2 = null;
                String strN45 = null;
                ArrayList arrayListL3 = null;
                String strN46 = null;
                boolean zF11 = false;
                String strN47 = null;
                while (parcel.dataPosition() < iS20) {
                    int i28 = parcel.readInt();
                    switch ((char) i28) {
                        case 2:
                            arrayListL2 = i0.o.l(parcel, i28);
                            break;
                        case 3:
                        default:
                            i0.o.O(parcel, i28);
                            break;
                        case 4:
                            strN47 = i0.o.n(parcel, i28);
                            break;
                        case 5:
                            strN45 = i0.o.n(parcel, i28);
                            break;
                        case 6:
                            arrayListL3 = i0.o.l(parcel, i28);
                            break;
                        case 7:
                            zF11 = i0.o.F(parcel, i28);
                            break;
                        case '\b':
                            strN46 = i0.o.n(parcel, i28);
                            break;
                    }
                }
                i0.o.v(parcel, iS20);
                tb.g gVar2 = new tb.g();
                gVar2.f33688b = arrayListL2;
                gVar2.f33689c = strN47;
                gVar2.f33690d = strN45;
                gVar2.f33691e = arrayListL3;
                gVar2.f33692f = zF11;
                gVar2.f33693g = strN46;
                return gVar2;
            case 20:
                int iS21 = i0.o.S(parcel);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                String strN48 = null;
                ArrayList arrayListR = arrayList2;
                ArrayList arrayListR2 = arrayList3;
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                ArrayList arrayList6 = new ArrayList();
                ub.f fVar3 = null;
                String strN49 = null;
                String strN50 = null;
                String strN51 = null;
                String strN52 = null;
                String strN53 = null;
                String strN54 = null;
                String strN55 = null;
                String strN56 = null;
                String strN57 = null;
                String strN58 = null;
                ub.c cVar = null;
                int iH19 = 0;
                boolean zF12 = false;
                String strN59 = null;
                while (parcel.dataPosition() < iS21) {
                    int i29 = parcel.readInt();
                    ub.f fVar4 = fVar3;
                    switch ((char) i29) {
                        case 2:
                            strN48 = i0.o.n(parcel, i29);
                            break;
                        case 3:
                            strN59 = i0.o.n(parcel, i29);
                            break;
                        case 4:
                            strN51 = i0.o.n(parcel, i29);
                            break;
                        case 5:
                            strN52 = i0.o.n(parcel, i29);
                            break;
                        case 6:
                            strN53 = i0.o.n(parcel, i29);
                            break;
                        case 7:
                            strN54 = i0.o.n(parcel, i29);
                            break;
                        case '\b':
                            strN55 = i0.o.n(parcel, i29);
                            break;
                        case '\t':
                            strN56 = i0.o.n(parcel, i29);
                            break;
                        case '\n':
                            strN50 = i0.o.n(parcel, i29);
                            break;
                        case 11:
                            strN49 = i0.o.n(parcel, i29);
                            break;
                        case '\f':
                            iH19 = i0.o.H(parcel, i29);
                            break;
                        case '\r':
                            arrayList = i0.o.r(parcel, i29, ub.h.CREATOR);
                            break;
                        case 14:
                            fVar3 = (ub.f) i0.o.m(parcel, i29, ub.f.CREATOR);
                            continue;
                        case 15:
                            arrayListR = i0.o.r(parcel, i29, LatLng.CREATOR);
                            break;
                        case 16:
                            strN57 = i0.o.n(parcel, i29);
                            break;
                        case 17:
                            strN58 = i0.o.n(parcel, i29);
                            break;
                        case 18:
                            arrayListR2 = i0.o.r(parcel, i29, ub.b.CREATOR);
                            break;
                        case 19:
                            zF12 = i0.o.F(parcel, i29);
                            break;
                        case 20:
                            arrayList4 = i0.o.r(parcel, i29, ub.g.CREATOR);
                            break;
                        case 21:
                            arrayList5 = i0.o.r(parcel, i29, ub.e.CREATOR);
                            break;
                        case 22:
                            arrayList6 = i0.o.r(parcel, i29, ub.g.CREATOR);
                            break;
                        case 23:
                            cVar = (ub.c) i0.o.m(parcel, i29, ub.c.CREATOR);
                            break;
                        default:
                            i0.o.O(parcel, i29);
                            break;
                    }
                    fVar3 = fVar4;
                }
                i0.o.v(parcel, iS21);
                tb.h hVar = new tb.h();
                hVar.f33694b = strN48;
                hVar.f33695c = strN59;
                hVar.f33696d = strN51;
                hVar.f33697e = strN52;
                hVar.f33698f = strN53;
                hVar.f33699g = strN54;
                hVar.f33700h = strN55;
                hVar.i = strN56;
                hVar.f33701j = strN50;
                hVar.f33702k = strN49;
                hVar.f33703l = iH19;
                hVar.f33704m = arrayList;
                hVar.f33705n = fVar3;
                hVar.f33706o = arrayListR;
                hVar.f33707p = strN57;
                hVar.f33708q = strN58;
                hVar.f33709r = arrayListR2;
                hVar.f33710s = zF12;
                hVar.f33711t = arrayList4;
                hVar.f33712u = arrayList5;
                hVar.f33713v = arrayList6;
                hVar.f33714w = cVar;
                return hVar;
            case 21:
                int iS22 = i0.o.S(parcel);
                String strN60 = null;
                String strN61 = null;
                String[] strArrO2 = null;
                String strN62 = null;
                tb.s sVar4 = null;
                tb.s sVar5 = null;
                tb.h[] hVarArr = null;
                tb.i[] iVarArr = null;
                UserAddress userAddress4 = null;
                UserAddress userAddress5 = null;
                tb.f[] fVarArr2 = null;
                while (parcel.dataPosition() < iS22) {
                    int i30 = parcel.readInt();
                    switch ((char) i30) {
                        case 2:
                            strN60 = i0.o.n(parcel, i30);
                            break;
                        case 3:
                            strN61 = i0.o.n(parcel, i30);
                            break;
                        case 4:
                            strArrO2 = i0.o.o(parcel, i30);
                            break;
                        case 5:
                            strN62 = i0.o.n(parcel, i30);
                            break;
                        case 6:
                            sVar4 = (tb.s) i0.o.m(parcel, i30, tb.s.CREATOR);
                            break;
                        case 7:
                            sVar5 = (tb.s) i0.o.m(parcel, i30, tb.s.CREATOR);
                            break;
                        case '\b':
                            hVarArr = (tb.h[]) i0.o.q(parcel, i30, tb.h.CREATOR);
                            break;
                        case '\t':
                            iVarArr = (tb.i[]) i0.o.q(parcel, i30, tb.i.CREATOR);
                            break;
                        case '\n':
                            userAddress4 = (UserAddress) i0.o.m(parcel, i30, UserAddress.CREATOR);
                            break;
                        case 11:
                            userAddress5 = (UserAddress) i0.o.m(parcel, i30, UserAddress.CREATOR);
                            break;
                        case '\f':
                            fVarArr2 = (tb.f[]) i0.o.q(parcel, i30, tb.f.CREATOR);
                            break;
                        default:
                            i0.o.O(parcel, i30);
                            break;
                    }
                }
                i0.o.v(parcel, iS22);
                MaskedWallet maskedWallet = new MaskedWallet();
                maskedWallet.f14434b = strN60;
                maskedWallet.f14435c = strN61;
                maskedWallet.f14436d = strArrO2;
                maskedWallet.f14437e = strN62;
                maskedWallet.f14438f = sVar4;
                maskedWallet.f14439g = sVar5;
                maskedWallet.f14440h = hVarArr;
                maskedWallet.i = iVarArr;
                maskedWallet.f14441j = userAddress4;
                maskedWallet.f14442k = userAddress5;
                maskedWallet.f14443l = fVarArr2;
                return maskedWallet;
            case 22:
                int iS23 = i0.o.S(parcel);
                int iH20 = 0;
                String strN63 = null;
                String strN64 = null;
                CommonWalletObject commonWalletObject = null;
                while (parcel.dataPosition() < iS23) {
                    int i31 = parcel.readInt();
                    char c20 = (char) i31;
                    if (c20 == 1) {
                        iH20 = i0.o.H(parcel, i31);
                    } else if (c20 == 2) {
                        strN63 = i0.o.n(parcel, i31);
                    } else if (c20 == 3) {
                        strN64 = i0.o.n(parcel, i31);
                    } else if (c20 != 4) {
                        i0.o.O(parcel, i31);
                    } else {
                        commonWalletObject = (CommonWalletObject) i0.o.m(parcel, i31, CommonWalletObject.CREATOR);
                    }
                }
                i0.o.v(parcel, iS23);
                return new tb.i(iH20, strN63, strN64, commonWalletObject);
            case 23:
                int iS24 = i0.o.S(parcel);
                String strN65 = null;
                tb.d dVar2 = null;
                UserAddress userAddress6 = null;
                tb.l lVar2 = null;
                String strN66 = null;
                Bundle bundleI4 = null;
                String strN67 = null;
                Bundle bundleI5 = null;
                while (parcel.dataPosition() < iS24) {
                    int i32 = parcel.readInt();
                    switch ((char) i32) {
                        case 1:
                            strN65 = i0.o.n(parcel, i32);
                            break;
                        case 2:
                            dVar2 = (tb.d) i0.o.m(parcel, i32, tb.d.CREATOR);
                            break;
                        case 3:
                            userAddress6 = (UserAddress) i0.o.m(parcel, i32, UserAddress.CREATOR);
                            break;
                        case 4:
                            lVar2 = (tb.l) i0.o.m(parcel, i32, tb.l.CREATOR);
                            break;
                        case 5:
                            strN66 = i0.o.n(parcel, i32);
                            break;
                        case 6:
                            bundleI4 = i0.o.i(parcel, i32);
                            break;
                        case 7:
                            strN67 = i0.o.n(parcel, i32);
                            break;
                        case '\b':
                            bundleI5 = i0.o.i(parcel, i32);
                            break;
                        default:
                            i0.o.O(parcel, i32);
                            break;
                    }
                }
                i0.o.v(parcel, iS24);
                tb.j jVar = new tb.j();
                jVar.f33718b = strN65;
                jVar.f33719c = dVar2;
                jVar.f33720d = userAddress6;
                jVar.f33721e = lVar2;
                jVar.f33722f = strN66;
                jVar.f33723g = bundleI4;
                jVar.f33724h = strN67;
                jVar.i = bundleI5;
                return jVar;
            case 24:
                int iS25 = i0.o.S(parcel);
                boolean zF13 = false;
                tb.e eVar3 = null;
                tb.o oVar2 = null;
                ArrayList arrayListL4 = null;
                tb.m mVar = null;
                tb.p pVar2 = null;
                String strN68 = null;
                Bundle bundleI6 = null;
                boolean zF14 = true;
                boolean zF15 = false;
                boolean zF16 = false;
                while (parcel.dataPosition() < iS25) {
                    int i33 = parcel.readInt();
                    switch ((char) i33) {
                        case 1:
                            zF13 = i0.o.F(parcel, i33);
                            break;
                        case 2:
                            zF15 = i0.o.F(parcel, i33);
                            break;
                        case 3:
                            eVar3 = (tb.e) i0.o.m(parcel, i33, tb.e.CREATOR);
                            break;
                        case 4:
                            zF16 = i0.o.F(parcel, i33);
                            break;
                        case 5:
                            oVar2 = (tb.o) i0.o.m(parcel, i33, tb.o.CREATOR);
                            break;
                        case 6:
                            arrayListL4 = i0.o.l(parcel, i33);
                            break;
                        case 7:
                            mVar = (tb.m) i0.o.m(parcel, i33, tb.m.CREATOR);
                            break;
                        case '\b':
                            pVar2 = (tb.p) i0.o.m(parcel, i33, tb.p.CREATOR);
                            break;
                        case '\t':
                            zF14 = i0.o.F(parcel, i33);
                            break;
                        case '\n':
                            strN68 = i0.o.n(parcel, i33);
                            break;
                        case 11:
                            bundleI6 = i0.o.i(parcel, i33);
                            break;
                        default:
                            i0.o.O(parcel, i33);
                            break;
                    }
                }
                i0.o.v(parcel, iS25);
                tb.k kVar = new tb.k();
                kVar.f33725b = zF13;
                kVar.f33726c = zF15;
                kVar.f33727d = eVar3;
                kVar.f33728e = zF16;
                kVar.f33729f = oVar2;
                kVar.f33730g = arrayListL4;
                kVar.f33731h = mVar;
                kVar.i = pVar2;
                kVar.f33732j = zF14;
                kVar.f33733k = strN68;
                kVar.f33734l = bundleI6;
                return kVar;
            case 25:
                int iS26 = i0.o.S(parcel);
                int iH21 = 0;
                String strN69 = null;
                while (parcel.dataPosition() < iS26) {
                    int i34 = parcel.readInt();
                    char c21 = (char) i34;
                    if (c21 == 2) {
                        iH21 = i0.o.H(parcel, i34);
                    } else if (c21 != 3) {
                        i0.o.O(parcel, i34);
                    } else {
                        strN69 = i0.o.n(parcel, i34);
                    }
                }
                i0.o.v(parcel, iS26);
                tb.l lVar3 = new tb.l();
                lVar3.f33735b = iH21;
                lVar3.f33736c = strN69;
                return lVar3;
            case 26:
                int iS27 = i0.o.S(parcel);
                int iH22 = 0;
                Bundle bundleI7 = null;
                while (parcel.dataPosition() < iS27) {
                    int i35 = parcel.readInt();
                    char c22 = (char) i35;
                    if (c22 == 2) {
                        iH22 = i0.o.H(parcel, i35);
                    } else if (c22 != 3) {
                        i0.o.O(parcel, i35);
                    } else {
                        bundleI7 = i0.o.i(parcel, i35);
                    }
                }
                i0.o.v(parcel, iS27);
                tb.m mVar2 = new tb.m();
                new Bundle();
                mVar2.f33737b = iH22;
                mVar2.f33738c = bundleI7;
                return mVar2;
            case 27:
                int iS28 = i0.o.S(parcel);
                int iH23 = 0;
                int iH24 = 0;
                boolean zF17 = false;
                boolean zF18 = false;
                String strN70 = null;
                while (parcel.dataPosition() < iS28) {
                    int i36 = parcel.readInt();
                    char c23 = (char) i36;
                    if (c23 == 2) {
                        strN70 = i0.o.n(parcel, i36);
                    } else if (c23 == 3) {
                        iH23 = i0.o.H(parcel, i36);
                    } else if (c23 == 4) {
                        iH24 = i0.o.H(parcel, i36);
                    } else if (c23 == 5) {
                        zF17 = i0.o.F(parcel, i36);
                    } else if (c23 != 6) {
                        i0.o.O(parcel, i36);
                    } else {
                        zF18 = i0.o.F(parcel, i36);
                    }
                }
                i0.o.v(parcel, iS28);
                return new u9.a(strN70, iH23, iH24, zF17, zF18);
            case 28:
                int iS29 = i0.o.S(parcel);
                ArrayList arrayList7 = new ArrayList();
                ArrayList arrayList8 = new ArrayList();
                ArrayList arrayList9 = new ArrayList();
                String strN71 = null;
                ArrayList arrayListR3 = arrayList9;
                ArrayList arrayList10 = new ArrayList();
                ArrayList arrayList11 = new ArrayList();
                ArrayList arrayList12 = new ArrayList();
                String strN72 = null;
                String strN73 = null;
                ub.f fVar5 = null;
                String strN74 = null;
                String strN75 = null;
                String strN76 = null;
                String strN77 = null;
                String strN78 = null;
                String strN79 = null;
                int iH25 = 0;
                boolean zF19 = false;
                String strN80 = null;
                while (parcel.dataPosition() < iS29) {
                    int i37 = parcel.readInt();
                    String str = strN73;
                    switch ((char) i37) {
                        case 2:
                            strN71 = i0.o.n(parcel, i37);
                            break;
                        case 3:
                            strN80 = i0.o.n(parcel, i37);
                            break;
                        case 4:
                            strN74 = i0.o.n(parcel, i37);
                            break;
                        case 5:
                            strN75 = i0.o.n(parcel, i37);
                            break;
                        case 6:
                            strN76 = i0.o.n(parcel, i37);
                            break;
                        case 7:
                            strN77 = i0.o.n(parcel, i37);
                            break;
                        case '\b':
                            strN78 = i0.o.n(parcel, i37);
                            break;
                        case '\t':
                            strN72 = i0.o.n(parcel, i37);
                            break;
                        case '\n':
                            iH25 = i0.o.H(parcel, i37);
                            break;
                        case 11:
                            arrayList7 = i0.o.r(parcel, i37, ub.h.CREATOR);
                            break;
                        case '\f':
                            fVar5 = (ub.f) i0.o.m(parcel, i37, ub.f.CREATOR);
                            break;
                        case '\r':
                            arrayList8 = i0.o.r(parcel, i37, LatLng.CREATOR);
                            break;
                        case 14:
                            strN73 = i0.o.n(parcel, i37);
                            continue;
                        case 15:
                            strN79 = i0.o.n(parcel, i37);
                            break;
                        case 16:
                            arrayListR3 = i0.o.r(parcel, i37, ub.b.CREATOR);
                            break;
                        case 17:
                            zF19 = i0.o.F(parcel, i37);
                            break;
                        case 18:
                            arrayList10 = i0.o.r(parcel, i37, ub.g.CREATOR);
                            break;
                        case 19:
                            arrayList11 = i0.o.r(parcel, i37, ub.e.CREATOR);
                            break;
                        case 20:
                            arrayList12 = i0.o.r(parcel, i37, ub.g.CREATOR);
                            break;
                        default:
                            i0.o.O(parcel, i37);
                            break;
                    }
                    strN73 = str;
                }
                i0.o.v(parcel, iS29);
                CommonWalletObject commonWalletObject2 = new CommonWalletObject();
                commonWalletObject2.f14444b = strN71;
                commonWalletObject2.f14445c = strN80;
                commonWalletObject2.f14446d = strN74;
                commonWalletObject2.f14447e = strN75;
                commonWalletObject2.f14448f = strN76;
                commonWalletObject2.f14449g = strN77;
                commonWalletObject2.f14450h = strN78;
                commonWalletObject2.i = strN72;
                commonWalletObject2.f14451j = iH25;
                commonWalletObject2.f14452k = arrayList7;
                commonWalletObject2.f14453l = fVar5;
                commonWalletObject2.f14454m = arrayList8;
                commonWalletObject2.f14455n = strN73;
                commonWalletObject2.f14456o = strN79;
                commonWalletObject2.f14457p = arrayListR3;
                commonWalletObject2.f14458q = zF19;
                commonWalletObject2.f14459r = arrayList10;
                commonWalletObject2.f14460s = arrayList11;
                commonWalletObject2.f14461t = arrayList12;
                return commonWalletObject2;
            default:
                int iS30 = i0.o.S(parcel);
                String strN81 = null;
                String strN82 = null;
                while (parcel.dataPosition() < iS30) {
                    int i38 = parcel.readInt();
                    char c24 = (char) i38;
                    if (c24 == 2) {
                        strN81 = i0.o.n(parcel, i38);
                    } else if (c24 != 3) {
                        i0.o.O(parcel, i38);
                    } else {
                        strN82 = i0.o.n(parcel, i38);
                    }
                }
                i0.o.v(parcel, iS30);
                ub.a aVar2 = new ub.a();
                aVar2.f34417b = strN81;
                aVar2.f34418c = strN82;
                return aVar2;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.f31395a) {
            case 0:
                return new k0[i];
            case 1:
                return new g[i];
            case 2:
                return new h[i];
            case 3:
                return new qb.b[i];
            case 4:
                return new qb.e[i];
            case 5:
                return new qb.f[i];
            case 6:
                return new r9.a[i];
            case 7:
                return new s9.e[i];
            case 8:
                return new AdOverlayInfoParcel[i];
            case 9:
                return new t9.o[i];
            case 10:
                return new tb.t[i];
            case 11:
                return new tb.o[i];
            case 12:
                return new tb.p[i];
            case 13:
                return new tb.u[i];
            case 14:
                return new tb.s[i];
            case 15:
                return new tb.d[i];
            case 16:
                return new tb.e[i];
            case 17:
                return new FullWallet[i];
            case 18:
                return new tb.f[i];
            case 19:
                return new tb.g[i];
            case 20:
                return new tb.h[i];
            case 21:
                return new MaskedWallet[i];
            case 22:
                return new tb.i[i];
            case 23:
                return new tb.j[i];
            case 24:
                return new tb.k[i];
            case 25:
                return new tb.l[i];
            case 26:
                return new tb.m[i];
            case 27:
                return new u9.a[i];
            case 28:
                return new CommonWalletObject[i];
            default:
                return new ub.a[i];
        }
    }
}
