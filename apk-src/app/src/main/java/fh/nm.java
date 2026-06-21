package fh;

import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class nm implements Deserializer {
    public static nd a(ParsingContext parsingContext, JSONObject jSONObject) {
        JsonExpressionParser.readExpression(parsingContext, jSONObject, "value", qm.f18194a, mg.F);
        return new nd();
    }

    @Override // com.yandex.div.serialization.Deserializer
    public final /* bridge */ /* synthetic */ Object deserialize(ParsingContext parsingContext, Object obj) {
        return a(parsingContext, (JSONObject) obj);
    }
}
