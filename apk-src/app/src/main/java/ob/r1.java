package ob;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.ur;
import com.google.android.gms.internal.consent_sdk.j7;
import io.sentry.TransactionOptions;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class r1 extends com.google.android.gms.internal.measurement.x implements g0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z3 f30382b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Boolean f30383c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f30384d;

    public r1(z3 z3Var) {
        super("com.google.android.gms.measurement.internal.IMeasurementService");
        pa.c0.i(z3Var);
        this.f30382b = z3Var;
        this.f30384d = null;
    }

    @Override // ob.g0
    public final List A1(String str, String str2, String str3) {
        D0(str, true);
        z3 z3Var = this.f30382b;
        try {
            return (List) z3Var.e().J(new p1(this, str, str2, str3, 3)).get();
        } catch (InterruptedException | ExecutionException e3) {
            z3Var.b().f30411g.g(e3, "Failed to get conditional user properties as");
            return Collections.EMPTY_LIST;
        }
    }

    public final void D0(String str, boolean z5) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        z3 z3Var = this.f30382b;
        if (zIsEmpty) {
            z3Var.b().f30411g.f("Measurement Service called without app package");
            throw new SecurityException("Measurement Service called without app package");
        }
        if (z5) {
            try {
                if (this.f30383c == null) {
                    boolean z10 = true;
                    if (!"com.google.android.gms".equals(this.f30384d) && !ua.b.j(z3Var.f30615m.f30260b, Binder.getCallingUid()) && !ma.k.b(z3Var.f30615m.f30260b).c(Binder.getCallingUid())) {
                        z10 = false;
                    }
                    this.f30383c = Boolean.valueOf(z10);
                }
                if (this.f30383c.booleanValue()) {
                    return;
                }
            } catch (SecurityException e3) {
                z3Var.b().f30411g.g(s0.K(str), "Measurement Service called with invalid calling package. appId");
                throw e3;
            }
        }
        if (this.f30384d == null) {
            Context context = z3Var.f30615m.f30260b;
            int callingUid = Binder.getCallingUid();
            int i = ma.j.f28781e;
            if (ua.b.n(context, str, callingUid)) {
                this.f30384d = str;
            }
        }
        if (str.equals(this.f30384d)) {
            return;
        }
        throw new SecurityException("Unknown calling package name '" + str + "'.");
    }

    public final void E0(Runnable runnable) {
        z3 z3Var = this.f30382b;
        if (z3Var.e().I()) {
            runnable.run();
        } else {
            z3Var.e().L(runnable);
        }
    }

    @Override // ob.g0
    public final List H0(String str, String str2, String str3, boolean z5) {
        D0(str, true);
        z3 z3Var = this.f30382b;
        try {
            List<c4> list = (List) z3Var.e().J(new p1(this, str, str2, str3, 1)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (c4 c4Var : list) {
                if (z5 || !e4.Z(c4Var.f29990c)) {
                    arrayList.add(new b4(c4Var));
                }
            }
            return arrayList;
        } catch (InterruptedException e3) {
            e = e3;
            z3Var.b().f30411g.h(s0.K(str), "Failed to get user properties as. appId", e);
            return Collections.EMPTY_LIST;
        } catch (ExecutionException e7) {
            e = e7;
            z3Var.b().f30411g.h(s0.K(str), "Failed to get user properties as. appId", e);
            return Collections.EMPTY_LIST;
        }
    }

    @Override // ob.g0
    public final void J0(g4 g4Var) {
        n0(g4Var);
        E0(new n1(this, g4Var, 0));
    }

    @Override // ob.g0
    public final void J3(g4 g4Var) {
        n0(g4Var);
        E0(new n1(this, g4Var, 1));
    }

    @Override // ob.g0
    public final void K1(g4 g4Var) {
        pa.c0.f(g4Var.f30131b);
        pa.c0.i(g4Var.f30148t);
        l0(new n1(this, g4Var, 2));
    }

    @Override // ob.g0
    public final void L2(e eVar, g4 g4Var) {
        pa.c0.i(eVar);
        pa.c0.i(eVar.f30075d);
        n0(g4Var);
        e eVar2 = new e(eVar);
        eVar2.f30073b = g4Var.f30131b;
        E0(new aa.y(17, this, eVar2, g4Var, false));
    }

    @Override // ob.g0
    public final void L3(g4 g4Var) {
        pa.c0.f(g4Var.f30131b);
        pa.c0.i(g4Var.f30148t);
        l0(new m1(this, g4Var, 2));
    }

    @Override // ob.g0
    public final void Q0(g4 g4Var) {
        String str = g4Var.f30131b;
        pa.c0.f(str);
        D0(str, false);
        E0(new m1(this, g4Var, 1));
    }

    @Override // ob.g0
    public final void Q2(g4 g4Var) {
        n0(g4Var);
        E0(new m1(this, g4Var, 0));
    }

    @Override // ob.g0
    public final List T1(String str, String str2, g4 g4Var) {
        n0(g4Var);
        String str3 = g4Var.f30131b;
        pa.c0.i(str3);
        z3 z3Var = this.f30382b;
        try {
            return (List) z3Var.e().J(new p1(this, str3, str, str2, 2)).get();
        } catch (InterruptedException | ExecutionException e3) {
            z3Var.b().f30411g.g(e3, "Failed to get conditional user properties");
            return Collections.EMPTY_LIST;
        }
    }

    @Override // ob.g0
    public final void V0(g4 g4Var, s3 s3Var, k0 k0Var) {
        n0(g4Var);
        String str = g4Var.f30131b;
        pa.c0.i(str);
        this.f30382b.e().L(new aa.b(this, str, s3Var, k0Var, 10));
    }

    @Override // ob.g0
    public final String b1(g4 g4Var) {
        n0(g4Var);
        z3 z3Var = this.f30382b;
        try {
            return (String) z3Var.e().J(new aa.x(z3Var, g4Var)).get(TransactionOptions.DEFAULT_DEADLINE_TIMEOUT_AUTO_TRANSACTION, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e3) {
            z3Var.b().f30411g.h(s0.K(g4Var.f30131b), "Failed to get app instance id. appId", e3);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.measurement.x
    public final boolean c0(int i, Parcel parcel, Parcel parcel2) {
        List list;
        z3 z3Var = this.f30382b;
        ArrayList arrayList = null;
        i0 h0Var = null;
        k0 j0Var = null;
        int i10 = 1;
        switch (i) {
            case 1:
                v vVar = (v) com.google.android.gms.internal.measurement.y.a(parcel, v.CREATOR);
                g4 g4Var = (g4) com.google.android.gms.internal.measurement.y.a(parcel, g4.CREATOR);
                com.google.android.gms.internal.measurement.y.d(parcel);
                u2(vVar, g4Var);
                parcel2.writeNoException();
                return true;
            case 2:
                b4 b4Var = (b4) com.google.android.gms.internal.measurement.y.a(parcel, b4.CREATOR);
                g4 g4Var2 = (g4) com.google.android.gms.internal.measurement.y.a(parcel, g4.CREATOR);
                com.google.android.gms.internal.measurement.y.d(parcel);
                o1(b4Var, g4Var2);
                parcel2.writeNoException();
                return true;
            case 3:
            case 8:
            case 22:
            case 23:
            case 28:
            default:
                return false;
            case 4:
                g4 g4Var3 = (g4) com.google.android.gms.internal.measurement.y.a(parcel, g4.CREATOR);
                com.google.android.gms.internal.measurement.y.d(parcel);
                Q2(g4Var3);
                parcel2.writeNoException();
                return true;
            case 5:
                v vVar2 = (v) com.google.android.gms.internal.measurement.y.a(parcel, v.CREATOR);
                String string = parcel.readString();
                parcel.readString();
                com.google.android.gms.internal.measurement.y.d(parcel);
                pa.c0.i(vVar2);
                pa.c0.f(string);
                D0(string, true);
                E0(new aa.y(19, this, vVar2, string, false));
                parcel2.writeNoException();
                return true;
            case 6:
                g4 g4Var4 = (g4) com.google.android.gms.internal.measurement.y.a(parcel, g4.CREATOR);
                com.google.android.gms.internal.measurement.y.d(parcel);
                J3(g4Var4);
                parcel2.writeNoException();
                return true;
            case 7:
                g4 g4Var5 = (g4) com.google.android.gms.internal.measurement.y.a(parcel, g4.CREATOR);
                z = parcel.readInt() != 0;
                com.google.android.gms.internal.measurement.y.d(parcel);
                n0(g4Var5);
                String str = g4Var5.f30131b;
                pa.c0.i(str);
                try {
                    List<c4> list2 = (List) z3Var.e().J(new aa.x(5, this, str)).get();
                    ArrayList arrayList2 = new ArrayList(list2.size());
                    for (c4 c4Var : list2) {
                        if (z || !e4.Z(c4Var.f29990c)) {
                            arrayList2.add(new b4(c4Var));
                        }
                        break;
                    }
                    arrayList = arrayList2;
                } catch (InterruptedException e3) {
                    e = e3;
                    z3Var.b().f30411g.h(s0.K(str), "Failed to get user properties. appId", e);
                } catch (ExecutionException e7) {
                    e = e7;
                    z3Var.b().f30411g.h(s0.K(str), "Failed to get user properties. appId", e);
                }
                parcel2.writeNoException();
                parcel2.writeTypedList(arrayList);
                return true;
            case 9:
                v vVar3 = (v) com.google.android.gms.internal.measurement.y.a(parcel, v.CREATOR);
                String string2 = parcel.readString();
                com.google.android.gms.internal.measurement.y.d(parcel);
                byte[] bArrC3 = c3(string2, vVar3);
                parcel2.writeNoException();
                parcel2.writeByteArray(bArrC3);
                return true;
            case 10:
                long j10 = parcel.readLong();
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                com.google.android.gms.internal.measurement.y.d(parcel);
                h1(j10, string3, string4, string5);
                parcel2.writeNoException();
                return true;
            case 11:
                g4 g4Var6 = (g4) com.google.android.gms.internal.measurement.y.a(parcel, g4.CREATOR);
                com.google.android.gms.internal.measurement.y.d(parcel);
                String strB1 = b1(g4Var6);
                parcel2.writeNoException();
                parcel2.writeString(strB1);
                return true;
            case 12:
                e eVar = (e) com.google.android.gms.internal.measurement.y.a(parcel, e.CREATOR);
                g4 g4Var7 = (g4) com.google.android.gms.internal.measurement.y.a(parcel, g4.CREATOR);
                com.google.android.gms.internal.measurement.y.d(parcel);
                L2(eVar, g4Var7);
                parcel2.writeNoException();
                return true;
            case 13:
                e eVar2 = (e) com.google.android.gms.internal.measurement.y.a(parcel, e.CREATOR);
                com.google.android.gms.internal.measurement.y.d(parcel);
                pa.c0.i(eVar2);
                pa.c0.i(eVar2.f30075d);
                pa.c0.f(eVar2.f30073b);
                D0(eVar2.f30073b, true);
                E0(new ed.c(23, this, new e(eVar2), z));
                parcel2.writeNoException();
                return true;
            case 14:
                String string6 = parcel.readString();
                String string7 = parcel.readString();
                ClassLoader classLoader = com.google.android.gms.internal.measurement.y.f14090a;
                boolean z5 = parcel.readInt() != 0;
                g4 g4Var8 = (g4) com.google.android.gms.internal.measurement.y.a(parcel, g4.CREATOR);
                com.google.android.gms.internal.measurement.y.d(parcel);
                List listT2 = t2(string6, string7, z5, g4Var8);
                parcel2.writeNoException();
                parcel2.writeTypedList(listT2);
                return true;
            case 15:
                String string8 = parcel.readString();
                String string9 = parcel.readString();
                String string10 = parcel.readString();
                ClassLoader classLoader2 = com.google.android.gms.internal.measurement.y.f14090a;
                boolean z10 = parcel.readInt() != 0;
                com.google.android.gms.internal.measurement.y.d(parcel);
                List listH0 = H0(string8, string9, string10, z10);
                parcel2.writeNoException();
                parcel2.writeTypedList(listH0);
                return true;
            case 16:
                String string11 = parcel.readString();
                String string12 = parcel.readString();
                g4 g4Var9 = (g4) com.google.android.gms.internal.measurement.y.a(parcel, g4.CREATOR);
                com.google.android.gms.internal.measurement.y.d(parcel);
                List listT1 = T1(string11, string12, g4Var9);
                parcel2.writeNoException();
                parcel2.writeTypedList(listT1);
                return true;
            case 17:
                String string13 = parcel.readString();
                String string14 = parcel.readString();
                String string15 = parcel.readString();
                com.google.android.gms.internal.measurement.y.d(parcel);
                List listA1 = A1(string13, string14, string15);
                parcel2.writeNoException();
                parcel2.writeTypedList(listA1);
                return true;
            case 18:
                g4 g4Var10 = (g4) com.google.android.gms.internal.measurement.y.a(parcel, g4.CREATOR);
                com.google.android.gms.internal.measurement.y.d(parcel);
                Q0(g4Var10);
                parcel2.writeNoException();
                return true;
            case 19:
                Bundle bundle = (Bundle) com.google.android.gms.internal.measurement.y.a(parcel, Bundle.CREATOR);
                g4 g4Var11 = (g4) com.google.android.gms.internal.measurement.y.a(parcel, g4.CREATOR);
                com.google.android.gms.internal.measurement.y.d(parcel);
                g3(bundle, g4Var11);
                parcel2.writeNoException();
                return true;
            case 20:
                g4 g4Var12 = (g4) com.google.android.gms.internal.measurement.y.a(parcel, g4.CREATOR);
                com.google.android.gms.internal.measurement.y.d(parcel);
                K1(g4Var12);
                parcel2.writeNoException();
                return true;
            case 21:
                g4 g4Var13 = (g4) com.google.android.gms.internal.measurement.y.a(parcel, g4.CREATOR);
                com.google.android.gms.internal.measurement.y.d(parcel);
                i iVarP2 = p2(g4Var13);
                parcel2.writeNoException();
                if (iVarP2 == null) {
                    parcel2.writeInt(0);
                    return true;
                }
                parcel2.writeInt(1);
                iVarP2.writeToParcel(parcel2, 1);
                return true;
            case 24:
                g4 g4Var14 = (g4) com.google.android.gms.internal.measurement.y.a(parcel, g4.CREATOR);
                Bundle bundle2 = (Bundle) com.google.android.gms.internal.measurement.y.a(parcel, Bundle.CREATOR);
                com.google.android.gms.internal.measurement.y.d(parcel);
                n0(g4Var14);
                String str2 = g4Var14.f30131b;
                pa.c0.i(str2);
                if (!z3Var.d0().M(null, d0.Y0)) {
                    try {
                        list = (List) z3Var.e().J(new q1(this, g4Var14, bundle2, i10)).get();
                    } catch (InterruptedException | ExecutionException e10) {
                        z3Var.b().f30411g.h(s0.K(str2), "Failed to get trigger URIs. appId", e10);
                        list = Collections.EMPTY_LIST;
                    }
                    break;
                } else {
                    try {
                        list = (List) z3Var.e().K(new q1(this, g4Var14, bundle2, z ? 1 : 0)).get(10000L, TimeUnit.MILLISECONDS);
                    } catch (InterruptedException | ExecutionException | TimeoutException e11) {
                        z3Var.b().f30411g.h(s0.K(str2), "Failed to get trigger URIs. appId", e11);
                        list = Collections.EMPTY_LIST;
                    }
                    break;
                }
                parcel2.writeNoException();
                parcel2.writeTypedList(list);
                return true;
            case 25:
                g4 g4Var15 = (g4) com.google.android.gms.internal.measurement.y.a(parcel, g4.CREATOR);
                com.google.android.gms.internal.measurement.y.d(parcel);
                n3(g4Var15);
                parcel2.writeNoException();
                return true;
            case 26:
                g4 g4Var16 = (g4) com.google.android.gms.internal.measurement.y.a(parcel, g4.CREATOR);
                com.google.android.gms.internal.measurement.y.d(parcel);
                L3(g4Var16);
                parcel2.writeNoException();
                return true;
            case 27:
                g4 g4Var17 = (g4) com.google.android.gms.internal.measurement.y.a(parcel, g4.CREATOR);
                com.google.android.gms.internal.measurement.y.d(parcel);
                J0(g4Var17);
                parcel2.writeNoException();
                return true;
            case 29:
                g4 g4Var18 = (g4) com.google.android.gms.internal.measurement.y.a(parcel, g4.CREATOR);
                s3 s3Var = (s3) com.google.android.gms.internal.measurement.y.a(parcel, s3.CREATOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IUploadBatchesCallback");
                    j0Var = iInterfaceQueryLocalInterface instanceof k0 ? (k0) iInterfaceQueryLocalInterface : new j0(strongBinder, "com.google.android.gms.measurement.internal.IUploadBatchesCallback", 3);
                }
                com.google.android.gms.internal.measurement.y.d(parcel);
                V0(g4Var18, s3Var, j0Var);
                parcel2.writeNoException();
                return true;
            case 30:
                g4 g4Var19 = (g4) com.google.android.gms.internal.measurement.y.a(parcel, g4.CREATOR);
                d dVar = (d) com.google.android.gms.internal.measurement.y.a(parcel, d.CREATOR);
                com.google.android.gms.internal.measurement.y.d(parcel);
                z2(g4Var19, dVar);
                parcel2.writeNoException();
                return true;
            case 31:
                g4 g4Var20 = (g4) com.google.android.gms.internal.measurement.y.a(parcel, g4.CREATOR);
                Bundle bundle3 = (Bundle) com.google.android.gms.internal.measurement.y.a(parcel, Bundle.CREATOR);
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.measurement.internal.ITriggerUrisCallback");
                    h0Var = iInterfaceQueryLocalInterface2 instanceof i0 ? (i0) iInterfaceQueryLocalInterface2 : new h0(strongBinder2, "com.google.android.gms.measurement.internal.ITriggerUrisCallback", 3);
                }
                com.google.android.gms.internal.measurement.y.d(parcel);
                q1(g4Var20, bundle3, h0Var);
                parcel2.writeNoException();
                return true;
        }
    }

    @Override // ob.g0
    public final byte[] c3(String str, v vVar) {
        pa.c0.f(str);
        pa.c0.i(vVar);
        D0(str, true);
        z3 z3Var = this.f30382b;
        ur urVar = z3Var.b().f30417n;
        l1 l1Var = z3Var.f30615m;
        o0 o0Var = l1Var.f30268k;
        String str2 = vVar.f30454b;
        urVar.g(o0Var.a(str2), "Log and bundle. event");
        z3Var.o().getClass();
        long jNanoTime = System.nanoTime() / 1000000;
        try {
            byte[] bArr = (byte[]) z3Var.e().K(new aa.w(this, vVar, str)).get();
            if (bArr == null) {
                z3Var.b().f30411g.g(s0.K(str), "Log and bundle returned null. appId");
                bArr = new byte[0];
            }
            z3Var.o().getClass();
            z3Var.b().f30417n.i("Log and bundle processed. event, size, time_ms", l1Var.f30268k.a(str2), Integer.valueOf(bArr.length), Long.valueOf((System.nanoTime() / 1000000) - jNanoTime));
            return bArr;
        } catch (InterruptedException e3) {
            e = e3;
            z3Var.b().f30411g.i("Failed to log and bundle. appId, event, error", s0.K(str), l1Var.f30268k.a(str2), e);
            return null;
        } catch (ExecutionException e7) {
            e = e7;
            z3Var.b().f30411g.i("Failed to log and bundle. appId, event, error", s0.K(str), l1Var.f30268k.a(str2), e);
            return null;
        }
    }

    @Override // ob.g0
    public final void g3(Bundle bundle, g4 g4Var) {
        n0(g4Var);
        String str = g4Var.f30131b;
        pa.c0.i(str);
        E0(new aa.b(this, bundle, str, g4Var));
    }

    @Override // ob.g0
    public final void h1(long j10, String str, String str2, String str3) {
        E0(new o1(this, str2, str3, str, j10, 0));
    }

    public final void l0(Runnable runnable) {
        z3 z3Var = this.f30382b;
        if (z3Var.e().I()) {
            runnable.run();
        } else {
            z3Var.e().N(runnable);
        }
    }

    public final void n0(g4 g4Var) {
        pa.c0.i(g4Var);
        String str = g4Var.f30131b;
        pa.c0.f(str);
        D0(str, false);
        this.f30382b.j0().G(g4Var.f30132c);
    }

    @Override // ob.g0
    public final void n3(g4 g4Var) {
        pa.c0.f(g4Var.f30131b);
        pa.c0.i(g4Var.f30148t);
        l0(new n1(this, g4Var, 3));
    }

    @Override // ob.g0
    public final void o1(b4 b4Var, g4 g4Var) {
        pa.c0.i(b4Var);
        n0(g4Var);
        E0(new aa.y(20, this, b4Var, g4Var, false));
    }

    @Override // ob.g0
    public final i p2(g4 g4Var) {
        n0(g4Var);
        String str = g4Var.f30131b;
        pa.c0.f(str);
        z3 z3Var = this.f30382b;
        try {
            return (i) z3Var.e().K(new aa.x(6, this, g4Var, false)).get(10000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e3) {
            z3Var.b().f30411g.h(s0.K(str), "Failed to get consent. appId", e3);
            return new i(null);
        }
    }

    @Override // ob.g0
    public final void q1(g4 g4Var, Bundle bundle, i0 i0Var) {
        n0(g4Var);
        String str = g4Var.f30131b;
        pa.c0.i(str);
        this.f30382b.e().L(new j7(this, g4Var, bundle, i0Var, str, 1));
    }

    @Override // ob.g0
    public final List t2(String str, String str2, boolean z5, g4 g4Var) {
        n0(g4Var);
        String str3 = g4Var.f30131b;
        pa.c0.i(str3);
        z3 z3Var = this.f30382b;
        try {
            List<c4> list = (List) z3Var.e().J(new p1(this, str3, str, str2, 0)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (c4 c4Var : list) {
                if (z5 || !e4.Z(c4Var.f29990c)) {
                    arrayList.add(new b4(c4Var));
                }
            }
            return arrayList;
        } catch (InterruptedException e3) {
            e = e3;
            z3Var.b().f30411g.h(s0.K(str3), "Failed to query user properties. appId", e);
            return Collections.EMPTY_LIST;
        } catch (ExecutionException e7) {
            e = e7;
            z3Var.b().f30411g.h(s0.K(str3), "Failed to query user properties. appId", e);
            return Collections.EMPTY_LIST;
        }
    }

    @Override // ob.g0
    public final void u2(v vVar, g4 g4Var) {
        pa.c0.i(vVar);
        n0(g4Var);
        E0(new aa.y(18, this, vVar, g4Var, false));
    }

    @Override // ob.g0
    public final void z2(g4 g4Var, d dVar) {
        n0(g4Var);
        E0(new aa.y(this, g4Var, dVar, 21));
    }
}
