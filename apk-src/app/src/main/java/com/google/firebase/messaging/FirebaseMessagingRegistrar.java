package com.google.firebase.messaging;

import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public class FirebaseMessagingRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-fcm";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ FirebaseMessaging lambda$getComponents$0(md.q qVar, md.c cVar) {
        fd.g gVar = (fd.g) cVar.a(fd.g.class);
        if (cVar.a(xd.a.class) == null) {
            return new FirebaseMessaging(gVar, cVar.d(fe.b.class), cVar.d(wd.f.class), (zd.d) cVar.a(zd.d.class), cVar.f(qVar), (vd.d) cVar.a(vd.d.class));
        }
        throw new ClassCastException();
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<md.b> getComponents() {
        md.q qVar = new md.q(pd.b.class, v8.f.class);
        bf.i iVarA = md.b.a(FirebaseMessaging.class);
        iVarA.f2116b = LIBRARY_NAME;
        iVarA.d(md.i.a(fd.g.class));
        iVarA.d(new md.i(0, 0, xd.a.class));
        iVarA.d(new md.i(0, 1, fe.b.class));
        iVarA.d(new md.i(0, 1, wd.f.class));
        iVarA.d(md.i.a(zd.d.class));
        iVarA.d(new md.i(qVar, 0, 1));
        iVarA.d(md.i.a(vd.d.class));
        iVarA.f2119e = new r(qVar, 0);
        iVarA.g(1);
        return Arrays.asList(iVarA.e(), rl.b.f(LIBRARY_NAME, "25.0.1"));
    }
}
