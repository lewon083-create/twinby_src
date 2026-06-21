package com.google.android.gms.internal.ads;

import android.content.Context;
import android.util.Base64;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class yf extends ig {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final ox0 f12607j = new ox0(7);
    public final Context i;

    public yf(qf qfVar, jd jdVar, int i, Context context) {
        super(qfVar, "BJ0iIx7YCr6PyW+pyNNozQaB62BBi5nixFl6WJUaFdU4X2GlfptGfOLgFJ7ri6Ag", "ovMA5nrmsfMPPc1p4911nPRjAFxE4I+3QWZwZMrn+uQ=", jdVar, i, 29);
        this.i = context;
    }

    @Override // com.google.android.gms.internal.ads.ig
    public final void a() {
        jd jdVar = this.f6484e;
        jdVar.b();
        ((wd) jdVar.f9560c).z("E");
        Context context = this.i;
        AtomicReference atomicReferenceE = f12607j.e(context.getPackageName());
        if (atomicReferenceE.get() == null) {
            synchronized (atomicReferenceE) {
                try {
                    if (atomicReferenceE.get() == null) {
                        atomicReferenceE.set((String) this.f6485f.invoke(null, context));
                    }
                } finally {
                }
            }
        }
        String str = (String) atomicReferenceE.get();
        jd jdVar2 = this.f6484e;
        synchronized (jdVar2) {
            String strEncodeToString = Base64.encodeToString(str.getBytes(), 11);
            jdVar2.b();
            ((wd) jdVar2.f9560c).z(strEncodeToString);
        }
    }
}
