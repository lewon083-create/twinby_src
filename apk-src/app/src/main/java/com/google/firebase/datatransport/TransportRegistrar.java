package com.google.firebase.datatransport;

import android.content.Context;
import bf.i;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import md.b;
import md.c;
import ni.v0;
import v8.f;
import w8.a;
import y8.q;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public class TransportRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-transport";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ f lambda$getComponents$0(c cVar) {
        q.b((Context) cVar.a(Context.class));
        return q.a().c(a.f35204f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ f lambda$getComponents$1(c cVar) {
        q.b((Context) cVar.a(Context.class));
        return q.a().c(a.f35204f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ f lambda$getComponents$2(c cVar) {
        q.b((Context) cVar.a(Context.class));
        return q.a().c(a.f35203e);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<b> getComponents() {
        i iVarA = b.a(f.class);
        iVarA.f2116b = LIBRARY_NAME;
        iVarA.d(md.i.a(Context.class));
        iVarA.f2119e = new v0(18);
        b bVarE = iVarA.e();
        i iVarB = b.b(new md.q(pd.a.class, f.class));
        iVarB.d(md.i.a(Context.class));
        iVarB.f2119e = new v0(19);
        b bVarE2 = iVarB.e();
        i iVarB2 = b.b(new md.q(pd.b.class, f.class));
        iVarB2.d(md.i.a(Context.class));
        iVarB2.f2119e = new v0(20);
        return Arrays.asList(bVarE, bVarE2, iVarB2.e(), rl.b.f(LIBRARY_NAME, "18.2.0"));
    }
}
