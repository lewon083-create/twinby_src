package re;

import java.util.Iterator;
import java.util.Map;
import me.t;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static a f32296a;

    public static void a(b bVar) {
        if (bVar instanceof com.google.gson.internal.bind.d) {
            com.google.gson.internal.bind.d dVar = (com.google.gson.internal.bind.d) bVar;
            dVar.N(5);
            Map.Entry entry = (Map.Entry) ((Iterator) dVar.P()).next();
            dVar.R(entry.getValue());
            dVar.R(new t((String) entry.getKey()));
            return;
        }
        int iB = bVar.i;
        if (iB == 0) {
            iB = bVar.b();
        }
        if (iB == 13) {
            bVar.i = 9;
            return;
        }
        if (iB == 12) {
            bVar.i = 8;
        } else {
            if (iB == 14) {
                bVar.i = 10;
                return;
            }
            throw new IllegalStateException("Expected a name but was " + pe.a.w(bVar.s()) + bVar.j());
        }
    }
}
