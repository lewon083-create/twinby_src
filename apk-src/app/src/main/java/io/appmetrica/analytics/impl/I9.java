package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils;
import io.appmetrica.analytics.coreutils.internal.time.TimeProvider;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.util.Map;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class I9 extends Qg {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final J9 f22446b;

    public I9(@NotNull Y4 y42, @NotNull TimeProvider timeProvider) {
        super(y42);
        this.f22446b = new J9(y42, timeProvider);
    }

    @Override // io.appmetrica.analytics.impl.Qg
    public final boolean a(@NotNull Q5 q5) {
        long jOptLong;
        J9 j92 = this.f22446b;
        C9 c9 = j92.f22524a.t().B;
        Long lValueOf = c9 != null ? Long.valueOf(c9.f22198a) : null;
        if (lValueOf != null) {
            wo woVar = j92.f22524a.f23300t;
            synchronized (woVar) {
                jOptLong = woVar.f24991a.a().optLong("external_attribution_window_start", -1L);
            }
            if (jOptLong < 0) {
                jOptLong = j92.f22525b.currentTimeMillis();
                j92.f22524a.f23300t.a(jOptLong);
            }
            if (j92.f22525b.currentTimeMillis() - jOptLong <= lValueOf.longValue()) {
                B9 b92 = (B9) MessageNano.mergeFrom(new B9(), q5.getValueBytes());
                int i = b92.f22136a;
                String str = new String(b92.f22137b, Charsets.UTF_8);
                String str2 = this.f22446b.f22524a.f23284c.k().get(Integer.valueOf(i));
                if (str2 != null) {
                    try {
                        if (JsonUtils.isEqualTo(new JSONObject(str), new JSONObject(str2))) {
                            this.f22888a.f23293m.info("Ignoring attribution of type `" + L9.a(i) + "` with value `" + str + "` since it is not new", new Object[0]);
                            return true;
                        }
                    } catch (Throwable unused) {
                    }
                }
                J9 j93 = this.f22446b;
                Map<Integer, String> mapK = j93.f22524a.f23284c.k();
                mapK.put(Integer.valueOf(i), str);
                j93.f22524a.f23284c.b(mapK);
                this.f22888a.f23293m.info("Handling attribution of type `" + L9.a(i) + '`', new Object[0]);
                return false;
            }
        }
        this.f22888a.f23293m.info("Ignoring attribution since out of collecting interval", new Object[0]);
        return true;
    }
}
