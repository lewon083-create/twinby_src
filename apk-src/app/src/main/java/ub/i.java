package ub;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.versionedparcelable.ParcelImpl;
import com.google.android.gms.identity.intents.model.UserAddress;
import i0.o;
import java.util.ArrayList;
import z2.d0;
import z2.i0;
import z2.l0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements Parcelable.Creator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f34442a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f34442a) {
            case 0:
                int iS = o.S(parcel);
                ArrayList arrayList = new ArrayList();
                String strN = null;
                String strN2 = null;
                while (parcel.dataPosition() < iS) {
                    int i = parcel.readInt();
                    char c8 = (char) i;
                    if (c8 == 2) {
                        strN = o.n(parcel, i);
                    } else if (c8 == 3) {
                        strN2 = o.n(parcel, i);
                    } else if (c8 != 4) {
                        o.O(parcel, i);
                    } else {
                        arrayList = o.r(parcel, i, a.CREATOR);
                    }
                }
                o.v(parcel, iS);
                b bVar = new b();
                bVar.f34419b = strN;
                bVar.f34420c = strN2;
                bVar.f34421d = arrayList;
                return bVar;
            case 1:
                int iS2 = o.S(parcel);
                String strN3 = null;
                d dVar = null;
                f fVar = null;
                while (parcel.dataPosition() < iS2) {
                    int i10 = parcel.readInt();
                    char c9 = (char) i10;
                    if (c9 == 2) {
                        strN3 = o.n(parcel, i10);
                    } else if (c9 == 3) {
                        dVar = (d) o.m(parcel, i10, d.CREATOR);
                    } else if (c9 != 5) {
                        o.O(parcel, i10);
                    } else {
                        fVar = (f) o.m(parcel, i10, f.CREATOR);
                    }
                }
                o.v(parcel, iS2);
                c cVar = new c();
                cVar.f34422b = strN3;
                cVar.f34423c = dVar;
                cVar.f34424d = fVar;
                return cVar;
            case 2:
                int iS3 = o.S(parcel);
                int iH = 0;
                String strN4 = null;
                int iH2 = -1;
                long jI = 0;
                double d10 = 0.0d;
                String strN5 = null;
                while (parcel.dataPosition() < iS3) {
                    int i11 = parcel.readInt();
                    switch ((char) i11) {
                        case 2:
                            iH = o.H(parcel, i11);
                            break;
                        case 3:
                            strN4 = o.n(parcel, i11);
                            break;
                        case 4:
                            o.W(parcel, i11, 8);
                            d10 = parcel.readDouble();
                            break;
                        case 5:
                            strN5 = o.n(parcel, i11);
                            break;
                        case 6:
                            jI = o.I(parcel, i11);
                            break;
                        case 7:
                            iH2 = o.H(parcel, i11);
                            break;
                        default:
                            o.O(parcel, i11);
                            break;
                    }
                }
                o.v(parcel, iS3);
                d dVar2 = new d();
                dVar2.f34425b = iH;
                dVar2.f34426c = strN4;
                dVar2.f34427d = d10;
                dVar2.f34428e = strN5;
                dVar2.f34429f = jI;
                dVar2.f34430g = iH2;
                return dVar2;
            case 3:
                int iS4 = o.S(parcel);
                String strN6 = null;
                String strN7 = null;
                while (parcel.dataPosition() < iS4) {
                    int i12 = parcel.readInt();
                    char c10 = (char) i12;
                    if (c10 == 2) {
                        strN6 = o.n(parcel, i12);
                    } else if (c10 != 3) {
                        o.O(parcel, i12);
                    } else {
                        strN7 = o.n(parcel, i12);
                    }
                }
                o.v(parcel, iS4);
                e eVar = new e();
                eVar.f34431b = strN6;
                eVar.f34432c = strN7;
                return eVar;
            case 4:
                int iS5 = o.S(parcel);
                long jI2 = 0;
                long jI3 = 0;
                while (parcel.dataPosition() < iS5) {
                    int i13 = parcel.readInt();
                    char c11 = (char) i13;
                    if (c11 == 2) {
                        jI2 = o.I(parcel, i13);
                    } else if (c11 != 3) {
                        o.O(parcel, i13);
                    } else {
                        jI3 = o.I(parcel, i13);
                    }
                }
                o.v(parcel, iS5);
                f fVar2 = new f();
                fVar2.f34433b = jI2;
                fVar2.f34434c = jI3;
                return fVar2;
            case 5:
                int iS6 = o.S(parcel);
                String strN8 = null;
                String strN9 = null;
                while (parcel.dataPosition() < iS6) {
                    int i14 = parcel.readInt();
                    char c12 = (char) i14;
                    if (c12 == 2) {
                        strN8 = o.n(parcel, i14);
                    } else if (c12 != 3) {
                        o.O(parcel, i14);
                    } else {
                        strN9 = o.n(parcel, i14);
                    }
                }
                o.v(parcel, iS6);
                g gVar = new g();
                gVar.f34435b = strN8;
                gVar.f34436c = strN9;
                return gVar;
            case 6:
                int iS7 = o.S(parcel);
                String strN10 = null;
                String strN11 = null;
                f fVar3 = null;
                g gVar2 = null;
                g gVar3 = null;
                while (parcel.dataPosition() < iS7) {
                    int i15 = parcel.readInt();
                    char c13 = (char) i15;
                    if (c13 == 2) {
                        strN10 = o.n(parcel, i15);
                    } else if (c13 == 3) {
                        strN11 = o.n(parcel, i15);
                    } else if (c13 == 4) {
                        fVar3 = (f) o.m(parcel, i15, f.CREATOR);
                    } else if (c13 == 5) {
                        gVar2 = (g) o.m(parcel, i15, g.CREATOR);
                    } else if (c13 != 6) {
                        o.O(parcel, i15);
                    } else {
                        gVar3 = (g) o.m(parcel, i15, g.CREATOR);
                    }
                }
                o.v(parcel, iS7);
                h hVar = new h();
                hVar.f34437b = strN10;
                hVar.f34438c = strN11;
                hVar.f34439d = fVar3;
                hVar.f34440e = gVar2;
                hVar.f34441f = gVar3;
                return hVar;
            case 7:
                return new uc.c((PendingIntent) parcel.readParcelable(uc.b.class.getClassLoader()), parcel.readInt() != 0);
            case 8:
                return new ParcelImpl(parcel);
            case 9:
                return new z2.b(parcel);
            case 10:
                return new z2.c(parcel);
            case 11:
                d0 d0Var = new d0();
                d0Var.f45824b = parcel.readString();
                d0Var.f45825c = parcel.readInt();
                return d0Var;
            case 12:
                i0 i0Var = new i0();
                i0Var.f45873f = null;
                i0Var.f45874g = new ArrayList();
                i0Var.f45875h = new ArrayList();
                i0Var.f45869b = parcel.createStringArrayList();
                i0Var.f45870c = parcel.createStringArrayList();
                i0Var.f45871d = (z2.b[]) parcel.createTypedArray(z2.b.CREATOR);
                i0Var.f45872e = parcel.readInt();
                i0Var.f45873f = parcel.readString();
                i0Var.f45874g = parcel.createStringArrayList();
                i0Var.f45875h = parcel.createTypedArrayList(z2.c.CREATOR);
                i0Var.i = parcel.createTypedArrayList(d0.CREATOR);
                return i0Var;
            case 13:
                return new l0(parcel);
            default:
                int iS8 = o.S(parcel);
                String strN12 = null;
                String strN13 = null;
                String strN14 = null;
                String strN15 = null;
                String strN16 = null;
                String strN17 = null;
                String strN18 = null;
                String strN19 = null;
                String strN20 = null;
                String strN21 = null;
                String strN22 = null;
                String strN23 = null;
                String strN24 = null;
                boolean zF = false;
                String strN25 = null;
                while (parcel.dataPosition() < iS8) {
                    int i16 = parcel.readInt();
                    boolean z5 = zF;
                    switch ((char) i16) {
                        case 2:
                            strN12 = o.n(parcel, i16);
                            break;
                        case 3:
                            strN25 = o.n(parcel, i16);
                            break;
                        case 4:
                            strN13 = o.n(parcel, i16);
                            break;
                        case 5:
                            strN14 = o.n(parcel, i16);
                            break;
                        case 6:
                            strN15 = o.n(parcel, i16);
                            break;
                        case 7:
                            strN16 = o.n(parcel, i16);
                            break;
                        case '\b':
                            strN17 = o.n(parcel, i16);
                            break;
                        case '\t':
                            strN18 = o.n(parcel, i16);
                            break;
                        case '\n':
                            strN19 = o.n(parcel, i16);
                            break;
                        case 11:
                            strN20 = o.n(parcel, i16);
                            break;
                        case '\f':
                            strN21 = o.n(parcel, i16);
                            break;
                        case '\r':
                            strN22 = o.n(parcel, i16);
                            break;
                        case 14:
                            zF = o.F(parcel, i16);
                            continue;
                        case 15:
                            strN24 = o.n(parcel, i16);
                            break;
                        case 16:
                            strN23 = o.n(parcel, i16);
                            break;
                        default:
                            o.O(parcel, i16);
                            break;
                    }
                    zF = z5;
                }
                boolean z10 = zF;
                o.v(parcel, iS8);
                UserAddress userAddress = new UserAddress();
                userAddress.f2646b = strN12;
                userAddress.f2647c = strN25;
                userAddress.f2648d = strN13;
                userAddress.f2649e = strN14;
                userAddress.f2650f = strN15;
                userAddress.f2651g = strN16;
                userAddress.f2652h = strN17;
                userAddress.i = strN18;
                userAddress.f2653j = strN19;
                userAddress.f2654k = strN20;
                userAddress.f2655l = strN21;
                userAddress.f2656m = strN22;
                userAddress.f2657n = z10;
                userAddress.f2658o = strN24;
                userAddress.f2659p = strN23;
                return userAddress;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f34442a) {
            case 0:
                return new b[i];
            case 1:
                return new c[i];
            case 2:
                return new d[i];
            case 3:
                return new e[i];
            case 4:
                return new f[i];
            case 5:
                return new g[i];
            case 6:
                return new h[i];
            case 7:
                return new uc.b[i];
            case 8:
                return new ParcelImpl[i];
            case 9:
                return new z2.b[i];
            case 10:
                return new z2.c[i];
            case 11:
                return new d0[i];
            case 12:
                return new i0[i];
            case 13:
                return new l0[i];
            default:
                return new UserAddress[i];
        }
    }
}
