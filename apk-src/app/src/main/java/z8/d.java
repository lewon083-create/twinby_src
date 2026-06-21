package z8;

import android.content.Context;
import com.google.android.datatransport.cct.CctBackendFactory;
import java.util.HashMap;
import x0.v;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v f46208a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x7.b f46209b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f46210c;

    public d(Context context, x7.b bVar) {
        v vVar = new v(11, context);
        this.f46210c = new HashMap();
        this.f46208a = vVar;
        this.f46209b = bVar;
    }

    public final synchronized e a(String str) {
        if (this.f46210c.containsKey(str)) {
            return (e) this.f46210c.get(str);
        }
        CctBackendFactory cctBackendFactoryW = this.f46208a.w(str);
        if (cctBackendFactoryW == null) {
            return null;
        }
        x7.b bVar = this.f46209b;
        e eVarCreate = cctBackendFactoryW.create(new b((Context) bVar.f35977b, (h9.a) bVar.f35978c, (h9.a) bVar.f35979d, str));
        this.f46210c.put(str, eVarCreate);
        return eVarCreate;
    }
}
