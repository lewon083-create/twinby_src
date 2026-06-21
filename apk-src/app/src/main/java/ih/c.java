package ih;

import android.text.TextUtils;
import com.yandex.varioqub.config.VarioqubSettings;
import java.util.Map;
import jh.d;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class c {
    public static VarioqubSettings a(d dVar) {
        String str = dVar.f26628a;
        if (str == null) {
            throw new IllegalArgumentException("Client id must not be null");
        }
        VarioqubSettings.Builder builder = new VarioqubSettings.Builder(str);
        if (!TextUtils.isEmpty(dVar.f26629b)) {
            builder.withUrl(dVar.f26629b);
        }
        Long l10 = dVar.f26630c;
        if (l10 != null) {
            builder.withThrottleInterval(l10.longValue());
        }
        Boolean bool = dVar.f26632e;
        if (bool != null && bool.booleanValue()) {
            builder.withLogs();
        }
        Boolean bool2 = dVar.f26633f;
        if (bool2 != null) {
            builder.withActivateEvent(bool2.booleanValue());
        }
        Map map = dVar.f26631d;
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                builder.withClientFeature((String) entry.getKey(), (String) entry.getValue());
            }
        }
        return builder.build();
    }
}
