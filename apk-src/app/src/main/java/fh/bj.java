package fh;

import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class bj implements Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sy f16944a;

    public bj(sy syVar) {
        this.f16944a = syVar;
    }

    @Override // com.yandex.div.serialization.Deserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final nd deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        return new nd();
    }
}
