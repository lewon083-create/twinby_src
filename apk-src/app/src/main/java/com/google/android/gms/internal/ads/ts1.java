package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class ts1 extends q.h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WeakReference f10709c;

    public ts1(jl jlVar) {
        this.f10709c = new WeakReference(jlVar);
    }

    @Override // q.h
    public final void a(q.g gVar) {
        jl jlVar = (jl) this.f10709c.get();
        if (jlVar != null) {
            jlVar.f6872b = gVar;
            try {
                ((b.b) gVar.f31543a).E0();
            } catch (RemoteException unused) {
            }
            s7.g gVar2 = jlVar.f6874d;
            if (gVar2 != null) {
                jl jlVar2 = (jl) gVar2.f32795b;
                q.g gVar3 = jlVar2.f6872b;
                if (gVar3 == null) {
                    jlVar2.f6871a = null;
                } else if (jlVar2.f6871a == null) {
                    jlVar2.f6871a = gVar3.c(null);
                }
                b7 b7Var = new b7(jlVar2.f6871a);
                t9.g0.A(b7Var, (Bundle) gVar2.f32796c);
                l6.i iVarA = b7Var.a();
                Intent intent = (Intent) iVarA.f27978c;
                Context context = (Context) gVar2.f32797d;
                intent.setPackage(vv.g(context));
                intent.setData((Uri) gVar2.f32798e);
                context.startActivity(intent, (Bundle) iVarA.f27979d);
                Activity activity = (Activity) context;
                ts1 ts1Var = jlVar2.f6873c;
                if (ts1Var == null) {
                    return;
                }
                activity.unbindService(ts1Var);
                jlVar2.f6872b = null;
                jlVar2.f6871a = null;
                jlVar2.f6873c = null;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        jl jlVar = (jl) this.f10709c.get();
        if (jlVar != null) {
            jlVar.f6872b = null;
            jlVar.f6871a = null;
        }
    }
}
