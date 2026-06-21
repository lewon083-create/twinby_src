package fh;

import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class db implements Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sy f17083a;

    public db(sy syVar) {
        this.f17083a = syVar;
    }

    @Override // com.yandex.div.serialization.Deserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final cb deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        if (((cd) JsonPropertyParser.readOptional(parsingContext, jSONObject, "space_between_centers", this.f17083a.f18554v3)) == null) {
            int i = gb.f17265a;
        }
        return new cb();
    }
}
