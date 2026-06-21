package yads;

import com.vk.api.sdk.exceptions.VKApiCodes;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.json.JSONException;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class i82 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hm2 f39461a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jm2 f39462b;

    public /* synthetic */ i82() {
        this(new hm2(), jm2.f39914b.a());
    }

    public final h82 a(ro2 ro2Var) {
        String str;
        jm2 jm2Var = this.f39462b;
        jm2Var.getClass();
        synchronized (jm2.f39915c) {
            str = (String) jm2Var.f39917a.get(ro2Var);
            jm2Var.f39917a.remove(ro2Var);
        }
        if (str == null) {
            return null;
        }
        try {
            this.f39461a.getClass();
            fm2 fm2VarA = hm2.a(str);
            byte[] bytes = fm2VarA.f38487b.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
            Map map = fm2VarA.f38486a;
            return new h82(VKApiCodes.CODE_ACCESS_DENIED_TO_ALBUM, bytes, map, h82.a(map), false);
        } catch (JSONException unused) {
            return null;
        }
    }

    public i82(hm2 hm2Var, jm2 jm2Var) {
        this.f39461a = hm2Var;
        this.f39462b = jm2Var;
    }
}
