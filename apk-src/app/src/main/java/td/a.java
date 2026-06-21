package td;

import java.util.Map;
import ud.f;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements rd.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f33765a;

    @Override // rd.a
    public final void a(Object obj, Object obj2) {
        switch (this.f33765a) {
            case 0:
                throw new rd.b("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                rd.e eVar = (rd.e) obj2;
                eVar.c(f.f34461g, entry.getKey());
                eVar.c(f.f34462h, entry.getValue());
                return;
            default:
                throw new rd.b("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }
    }
}
