package fh;

import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class lh implements Deserializer {
    public static kh a(ParsingContext parsingContext, JSONObject jSONObject) {
        JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "allow_empty", TypeHelpersKt.TYPE_HELPER_BOOLEAN, ParsingConvertersKt.ANY_TO_BOOLEAN, oh.f18036a);
        TypeHelper<String> typeHelper = TypeHelpersKt.TYPE_HELPER_STRING;
        JsonExpressionParser.readExpression(parsingContext, jSONObject, "label_id", typeHelper);
        JsonExpressionParser.readExpression(parsingContext, jSONObject, "pattern", typeHelper);
        return new kh();
    }

    @Override // com.yandex.div.serialization.Deserializer
    public final /* bridge */ /* synthetic */ Object deserialize(ParsingContext parsingContext, Object obj) {
        return a(parsingContext, (JSONObject) obj);
    }
}
