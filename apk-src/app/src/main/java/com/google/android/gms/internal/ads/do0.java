package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class do0 implements Callable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4619b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f4620c;

    public /* synthetic */ do0(int i, Object obj) {
        this.f4619b = i;
        this.f4620c = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() throws PackageManager.NameNotFoundException {
        Object objApply;
        Object objD;
        File file;
        boolean z5 = false;
        switch (this.f4619b) {
            case 0:
                String str = (String) ((n81) this.f4620c).f8239b;
                n81 n81Var = n81.f8237c;
                return new fo0(str, null);
            case 1:
                return new ul0(4, (List) ((tl0) this.f4620c).f10658c);
            case 2:
                ((nr0) this.f4620c).mo9h();
                return null;
            case 3:
                Context context = (Context) ((cw) this.f4620c).f4347c;
                return gr.o(context, context.getPackageName(), Integer.toString(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode));
            case 4:
                my0 my0Var = (my0) this.f4620c;
                synchronized (my0Var) {
                    try {
                        FileInputStream fileInputStream = new FileInputStream(my0Var.f8038a);
                        try {
                            objD = my0Var.f8040c.d(fileInputStream);
                            fileInputStream.close();
                        } catch (Throwable th2) {
                            try {
                                fileInputStream.close();
                                break;
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                            }
                            throw th2;
                        }
                    } catch (jy0 e3) {
                        objApply = my0Var.f8041d.apply(e3);
                        return objApply;
                    } catch (FileNotFoundException unused) {
                        objApply = my0Var.f8040c.l();
                        return objApply;
                    } catch (IOException e7) {
                        objApply = my0Var.f8041d.apply(new jy0(e7));
                        return objApply;
                    }
                }
                return objD;
            case 5:
                hz0 hz0Var = (hz0) this.f4620c;
                ((nz0) hz0Var.f6307c.j()).a();
                ((wz0) hz0Var.f6306b.j()).a();
                return null;
            case 6:
                return ((js1) this.f4620c).j();
            case 7:
                q11 q11Var = (q11) this.f4620c;
                j21 j21Var = q11Var.i;
                my0 my0Var2 = q11Var.f9284b;
                my0 my0Var3 = q11Var.f9286d;
                js1 js1Var = q11Var.f9288f;
                try {
                    File file2 = my0Var2.f8038a;
                    File file3 = my0Var2.f8038a;
                    if (file2.exists()) {
                        File file4 = ((my0) js1Var.j()).f8038a;
                        File file5 = ((my0) q11Var.f9287e.j()).f8038a;
                        try {
                            if (file4.exists()) {
                                File parentFile = file5.getParentFile();
                                if (parentFile != null) {
                                    ix.b0(parentFile);
                                }
                                ix.z(file5);
                                ix.N(file4, file5);
                            }
                            File file6 = my0Var3.f8038a;
                            File file7 = q11Var.f9285c.f8038a;
                            try {
                                if (file6.exists()) {
                                    ix.z(file7);
                                    ix.N(file6, file7);
                                }
                                file = q11Var.f9283a.f8038a;
                            } catch (IOException | SecurityException e10) {
                                j21Var.d(e10, 15312);
                            }
                            break;
                        } catch (IOException e11) {
                            e = e11;
                            j21Var.d(e, 15311);
                            my0Var2.f8038a.delete();
                            ((my0) js1Var.j()).f8038a.delete();
                            my0Var3.f8038a.delete();
                            return new Boolean(z5);
                        } catch (SecurityException e12) {
                            e = e12;
                            j21Var.d(e, 15311);
                            my0Var2.f8038a.delete();
                            ((my0) js1Var.j()).f8038a.delete();
                            my0Var3.f8038a.delete();
                            return new Boolean(z5);
                        }
                        try {
                            if (file2.exists()) {
                                ix.z(file);
                                ix.N(file2, file);
                            }
                            file3.delete();
                            ((my0) js1Var.j()).f8038a.delete();
                            my0Var3.f8038a.delete();
                            z5 = true;
                            break;
                        } catch (IOException | SecurityException e13) {
                            j21Var.d(e13, 15313);
                            my0Var2.f8038a.delete();
                            ((my0) js1Var.j()).f8038a.delete();
                            my0Var3.f8038a.delete();
                        }
                        return new Boolean(z5);
                    }
                    file3.delete();
                    ((my0) js1Var.j()).f8038a.delete();
                    my0Var3.f8038a.delete();
                    return new Boolean(z5);
                } catch (Throwable th4) {
                    my0Var2.f8038a.delete();
                    ((my0) js1Var.j()).f8038a.delete();
                    my0Var3.f8038a.delete();
                    throw th4;
                }
            case 8:
                b21 b21Var = (b21) this.f4620c;
                ju juVar = new ju(14, b21Var);
                synchronized (b21Var) {
                    j21 j21Var2 = b21Var.f3562d;
                    s71 s71VarK = vv.K(i0.o.w(new zd1(23, b21Var.f3561c, b21Var.f3564f, z5)), juVar, b21Var.f3563e);
                    j21Var2.e(52, s71VarK);
                    b21Var.f3566h = s71VarK;
                    break;
                }
                return "";
            case 9:
                Context context2 = ((b21) this.f4620c).f3561c;
                try {
                    return gr.o(context2, context2.getPackageName(), Integer.toString(context2.getPackageManager().getPackageInfo(context2.getPackageName(), 0).versionCode));
                } catch (Throwable unused2) {
                    return null;
                }
            default:
                f21 f21Var = (f21) this.f4620c;
                f21Var.getClass();
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.intent.action.USER_PRESENT");
                intentFilter.addAction("android.intent.action.SCREEN_OFF");
                f21Var.f5198b.registerReceiver(f21Var, intentFilter);
                return null;
        }
    }

    public /* synthetic */ do0(n81 n81Var) {
        this.f4619b = 0;
        n81 n81Var2 = n81.f8237c;
        this.f4620c = n81Var;
    }
}
