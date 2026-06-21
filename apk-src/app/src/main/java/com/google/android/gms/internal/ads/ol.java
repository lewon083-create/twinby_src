package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.File;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.function.Function;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class ol implements ms1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8719a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qs1 f8720b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ls1 f8721c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final qs1 f8722d;

    public /* synthetic */ ol(int i, ls1 ls1Var, ls1 ls1Var2, Object obj) {
        this.f8719a = i;
        this.f8721c = ls1Var;
        this.f8720b = (qs1) obj;
        this.f8722d = ls1Var2;
    }

    @Override // com.google.android.gms.internal.ads.qs1
    public final Object j() {
        switch (this.f8719a) {
            case 0:
                ((d10) this.f8720b).a();
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f8722d.j();
                return new nl(scheduledExecutorService);
            case 1:
                Context context = (Context) this.f8720b.j();
                return new a11(context, context.getSharedPreferences("pcvmspf2", 0), ls1.b(this.f8721c), (j21) this.f8722d.j());
            case 2:
                File file = (File) this.f8721c.j();
                ny0 ny0Var = (ny0) this.f8720b.j();
                final j21 j21Var = (j21) this.f8722d.j();
                bz0 bz0VarE = bz0.E();
                final int i = 0;
                Function function = new Function() { // from class: com.google.android.gms.internal.ads.r11
                    @Override // java.util.function.Function
                    public final /* synthetic */ Object apply(Object obj) {
                        Throwable th2 = (Throwable) obj;
                        switch (i) {
                            case 0:
                                j21Var.d(th2, 15308);
                                return bz0.E();
                            case 1:
                                j21Var.d(th2, 15310);
                                return new byte[0];
                            case 2:
                                j21Var.d(th2, 15310);
                                return new byte[0];
                            case 3:
                                j21Var.d(th2, 15309);
                                return new byte[0];
                            case 4:
                                j21Var.d(th2, 15309);
                                return new byte[0];
                            case 5:
                                j21Var.d(th2, 15308);
                                return bz0.E();
                            case 6:
                                j21Var.d(th2, 20310);
                                return new byte[0];
                            case 7:
                                j21Var.d(th2, 20309);
                                return new byte[0];
                            default:
                                j21Var.d(th2, 20308);
                                return bz0.E();
                        }
                    }
                };
                ny0Var.getClass();
                return new my0(file, ny0Var.f8496a, new in0(8, bz0VarE), function);
            case 3:
                File file2 = (File) this.f8721c.j();
                ny0 ny0Var2 = (ny0) this.f8720b.j();
                final j21 j21Var2 = (j21) this.f8722d.j();
                final int i10 = 2;
                return ny0Var2.a(file2, new byte[0], new Function() { // from class: com.google.android.gms.internal.ads.r11
                    @Override // java.util.function.Function
                    public final /* synthetic */ Object apply(Object obj) {
                        Throwable th2 = (Throwable) obj;
                        switch (i10) {
                            case 0:
                                j21Var2.d(th2, 15308);
                                return bz0.E();
                            case 1:
                                j21Var2.d(th2, 15310);
                                return new byte[0];
                            case 2:
                                j21Var2.d(th2, 15310);
                                return new byte[0];
                            case 3:
                                j21Var2.d(th2, 15309);
                                return new byte[0];
                            case 4:
                                j21Var2.d(th2, 15309);
                                return new byte[0];
                            case 5:
                                j21Var2.d(th2, 15308);
                                return bz0.E();
                            case 6:
                                j21Var2.d(th2, 20310);
                                return new byte[0];
                            case 7:
                                j21Var2.d(th2, 20309);
                                return new byte[0];
                            default:
                                j21Var2.d(th2, 20308);
                                return bz0.E();
                        }
                    }
                });
            case 4:
                File file3 = (File) this.f8721c.j();
                ny0 ny0Var3 = (ny0) this.f8720b.j();
                final j21 j21Var3 = (j21) this.f8722d.j();
                final int i11 = 4;
                return ny0Var3.a(file3, new byte[0], new Function() { // from class: com.google.android.gms.internal.ads.r11
                    @Override // java.util.function.Function
                    public final /* synthetic */ Object apply(Object obj) {
                        Throwable th2 = (Throwable) obj;
                        switch (i11) {
                            case 0:
                                j21Var3.d(th2, 15308);
                                return bz0.E();
                            case 1:
                                j21Var3.d(th2, 15310);
                                return new byte[0];
                            case 2:
                                j21Var3.d(th2, 15310);
                                return new byte[0];
                            case 3:
                                j21Var3.d(th2, 15309);
                                return new byte[0];
                            case 4:
                                j21Var3.d(th2, 15309);
                                return new byte[0];
                            case 5:
                                j21Var3.d(th2, 15308);
                                return bz0.E();
                            case 6:
                                j21Var3.d(th2, 20310);
                                return new byte[0];
                            case 7:
                                j21Var3.d(th2, 20309);
                                return new byte[0];
                            default:
                                j21Var3.d(th2, 20308);
                                return bz0.E();
                        }
                    }
                });
            case 5:
                File file4 = (File) this.f8721c.j();
                ny0 ny0Var4 = (ny0) this.f8720b.j();
                final j21 j21Var4 = (j21) this.f8722d.j();
                bz0 bz0VarE2 = bz0.E();
                final int i12 = 5;
                Function function2 = new Function() { // from class: com.google.android.gms.internal.ads.r11
                    @Override // java.util.function.Function
                    public final /* synthetic */ Object apply(Object obj) {
                        Throwable th2 = (Throwable) obj;
                        switch (i12) {
                            case 0:
                                j21Var4.d(th2, 15308);
                                return bz0.E();
                            case 1:
                                j21Var4.d(th2, 15310);
                                return new byte[0];
                            case 2:
                                j21Var4.d(th2, 15310);
                                return new byte[0];
                            case 3:
                                j21Var4.d(th2, 15309);
                                return new byte[0];
                            case 4:
                                j21Var4.d(th2, 15309);
                                return new byte[0];
                            case 5:
                                j21Var4.d(th2, 15308);
                                return bz0.E();
                            case 6:
                                j21Var4.d(th2, 20310);
                                return new byte[0];
                            case 7:
                                j21Var4.d(th2, 20309);
                                return new byte[0];
                            default:
                                j21Var4.d(th2, 20308);
                                return bz0.E();
                        }
                    }
                };
                ny0Var4.getClass();
                return new my0(file4, ny0Var4.f8496a, new in0(8, bz0VarE2), function2);
            case 6:
                File file5 = (File) this.f8721c.j();
                ny0 ny0Var5 = (ny0) this.f8720b.j();
                final j21 j21Var5 = (j21) this.f8722d.j();
                final int i13 = 1;
                return ny0Var5.a(file5, new byte[0], new Function() { // from class: com.google.android.gms.internal.ads.r11
                    @Override // java.util.function.Function
                    public final /* synthetic */ Object apply(Object obj) {
                        Throwable th2 = (Throwable) obj;
                        switch (i13) {
                            case 0:
                                j21Var5.d(th2, 15308);
                                return bz0.E();
                            case 1:
                                j21Var5.d(th2, 15310);
                                return new byte[0];
                            case 2:
                                j21Var5.d(th2, 15310);
                                return new byte[0];
                            case 3:
                                j21Var5.d(th2, 15309);
                                return new byte[0];
                            case 4:
                                j21Var5.d(th2, 15309);
                                return new byte[0];
                            case 5:
                                j21Var5.d(th2, 15308);
                                return bz0.E();
                            case 6:
                                j21Var5.d(th2, 20310);
                                return new byte[0];
                            case 7:
                                j21Var5.d(th2, 20309);
                                return new byte[0];
                            default:
                                j21Var5.d(th2, 20308);
                                return bz0.E();
                        }
                    }
                });
            case 7:
                File file6 = (File) this.f8721c.j();
                ny0 ny0Var6 = (ny0) this.f8720b.j();
                final j21 j21Var6 = (j21) this.f8722d.j();
                final int i14 = 3;
                return ny0Var6.a(file6, new byte[0], new Function() { // from class: com.google.android.gms.internal.ads.r11
                    @Override // java.util.function.Function
                    public final /* synthetic */ Object apply(Object obj) {
                        Throwable th2 = (Throwable) obj;
                        switch (i14) {
                            case 0:
                                j21Var6.d(th2, 15308);
                                return bz0.E();
                            case 1:
                                j21Var6.d(th2, 15310);
                                return new byte[0];
                            case 2:
                                j21Var6.d(th2, 15310);
                                return new byte[0];
                            case 3:
                                j21Var6.d(th2, 15309);
                                return new byte[0];
                            case 4:
                                j21Var6.d(th2, 15309);
                                return new byte[0];
                            case 5:
                                j21Var6.d(th2, 15308);
                                return bz0.E();
                            case 6:
                                j21Var6.d(th2, 20310);
                                return new byte[0];
                            case 7:
                                j21Var6.d(th2, 20309);
                                return new byte[0];
                            default:
                                j21Var6.d(th2, 20308);
                                return bz0.E();
                        }
                    }
                });
            case 8:
                return new t11((a11) this.f8721c.j(), (ExecutorService) this.f8720b.j(), (j21) this.f8722d.j());
            case 9:
                File file7 = (File) this.f8721c.j();
                ny0 ny0Var7 = (ny0) this.f8720b.j();
                final j21 j21Var7 = (j21) this.f8722d.j();
                bz0 bz0VarE3 = bz0.E();
                final int i15 = 8;
                Function function3 = new Function() { // from class: com.google.android.gms.internal.ads.r11
                    @Override // java.util.function.Function
                    public final /* synthetic */ Object apply(Object obj) {
                        Throwable th2 = (Throwable) obj;
                        switch (i15) {
                            case 0:
                                j21Var7.d(th2, 15308);
                                return bz0.E();
                            case 1:
                                j21Var7.d(th2, 15310);
                                return new byte[0];
                            case 2:
                                j21Var7.d(th2, 15310);
                                return new byte[0];
                            case 3:
                                j21Var7.d(th2, 15309);
                                return new byte[0];
                            case 4:
                                j21Var7.d(th2, 15309);
                                return new byte[0];
                            case 5:
                                j21Var7.d(th2, 15308);
                                return bz0.E();
                            case 6:
                                j21Var7.d(th2, 20310);
                                return new byte[0];
                            case 7:
                                j21Var7.d(th2, 20309);
                                return new byte[0];
                            default:
                                j21Var7.d(th2, 20308);
                                return bz0.E();
                        }
                    }
                };
                ny0Var7.getClass();
                return new my0(file7, ny0Var7.f8496a, new in0(8, bz0VarE3), function3);
            case 10:
                File file8 = (File) this.f8721c.j();
                ny0 ny0Var8 = (ny0) this.f8720b.j();
                final j21 j21Var8 = (j21) this.f8722d.j();
                final int i16 = 6;
                return ny0Var8.a(file8, new byte[0], new Function() { // from class: com.google.android.gms.internal.ads.r11
                    @Override // java.util.function.Function
                    public final /* synthetic */ Object apply(Object obj) {
                        Throwable th2 = (Throwable) obj;
                        switch (i16) {
                            case 0:
                                j21Var8.d(th2, 15308);
                                return bz0.E();
                            case 1:
                                j21Var8.d(th2, 15310);
                                return new byte[0];
                            case 2:
                                j21Var8.d(th2, 15310);
                                return new byte[0];
                            case 3:
                                j21Var8.d(th2, 15309);
                                return new byte[0];
                            case 4:
                                j21Var8.d(th2, 15309);
                                return new byte[0];
                            case 5:
                                j21Var8.d(th2, 15308);
                                return bz0.E();
                            case 6:
                                j21Var8.d(th2, 20310);
                                return new byte[0];
                            case 7:
                                j21Var8.d(th2, 20309);
                                return new byte[0];
                            default:
                                j21Var8.d(th2, 20308);
                                return bz0.E();
                        }
                    }
                });
            default:
                File file9 = (File) this.f8721c.j();
                ny0 ny0Var9 = (ny0) this.f8720b.j();
                final j21 j21Var9 = (j21) this.f8722d.j();
                final int i17 = 7;
                return ny0Var9.a(file9, new byte[0], new Function() { // from class: com.google.android.gms.internal.ads.r11
                    @Override // java.util.function.Function
                    public final /* synthetic */ Object apply(Object obj) {
                        Throwable th2 = (Throwable) obj;
                        switch (i17) {
                            case 0:
                                j21Var9.d(th2, 15308);
                                return bz0.E();
                            case 1:
                                j21Var9.d(th2, 15310);
                                return new byte[0];
                            case 2:
                                j21Var9.d(th2, 15310);
                                return new byte[0];
                            case 3:
                                j21Var9.d(th2, 15309);
                                return new byte[0];
                            case 4:
                                j21Var9.d(th2, 15309);
                                return new byte[0];
                            case 5:
                                j21Var9.d(th2, 15308);
                                return bz0.E();
                            case 6:
                                j21Var9.d(th2, 20310);
                                return new byte[0];
                            case 7:
                                j21Var9.d(th2, 20309);
                                return new byte[0];
                            default:
                                j21Var9.d(th2, 20308);
                                return bz0.E();
                        }
                    }
                });
        }
    }

    public ol(ns1 ns1Var, ls1 ls1Var, ls1 ls1Var2) {
        this.f8719a = 1;
        this.f8720b = ns1Var;
        this.f8721c = ls1Var;
        this.f8722d = ls1Var2;
    }

    public ol(qs1 qs1Var, qs1 qs1Var2, ls1 ls1Var) {
        this.f8719a = 0;
        this.f8720b = qs1Var;
        this.f8722d = qs1Var2;
        this.f8721c = ls1Var;
    }
}
