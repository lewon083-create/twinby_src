package com.google.firebase.analytics.connector.internal;

import android.content.Context;
import android.os.Bundle;
import bf.i;
import com.google.android.gms.internal.measurement.m1;
import com.google.firebase.components.ComponentRegistrar;
import fd.g;
import fh.zf;
import java.util.Arrays;
import java.util.List;
import jd.b;
import md.c;
import md.k;
import pa.c0;
import vd.d;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public class AnalyticsConnectorRegistrar implements ComponentRegistrar {
    /* JADX INFO: Access modifiers changed from: private */
    public static b lambda$getComponents$0(c cVar) {
        g gVar = (g) cVar.a(g.class);
        Context context = (Context) cVar.a(Context.class);
        d dVar = (d) cVar.a(d.class);
        c0.i(gVar);
        c0.i(context);
        c0.i(dVar);
        c0.i(context.getApplicationContext());
        if (jd.c.f26618b == null) {
            synchronized (jd.c.class) {
                try {
                    if (jd.c.f26618b == null) {
                        Bundle bundle = new Bundle(1);
                        gVar.a();
                        if ("[DEFAULT]".equals(gVar.f16759b)) {
                            ((k) dVar).b(j0.b.f26123e, jd.d.f26620a);
                            bundle.putBoolean("dataCollectionDefaultEnabled", gVar.k());
                        }
                        jd.c.f26618b = new jd.c(m1.e(context, bundle).f13879b);
                    }
                } finally {
                }
            }
        }
        return jd.c.f26618b;
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<md.b> getComponents() {
        i iVarA = md.b.a(b.class);
        iVarA.d(md.i.a(g.class));
        iVarA.d(md.i.a(Context.class));
        iVarA.d(md.i.a(d.class));
        iVarA.f2119e = zf.f19266b;
        iVarA.g(2);
        return Arrays.asList(iVarA.e(), rl.b.f("fire-analytics", "23.0.0"));
    }
}
