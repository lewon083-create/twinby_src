package fh;

import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class gz implements Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sy f17314a;

    public gz(sy syVar) {
        this.f17314a = syVar;
    }

    @Override // com.yandex.div.serialization.Deserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final zf deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        JsonExpressionParser.readExpression(parsingContext, jSONObject, "get", TypeHelpersKt.TYPE_HELPER_STRING);
        if (((String) JsonPropertyParser.readOptional(parsingContext, jSONObject, "new_value_variable_name")) == null) {
            TypeHelper typeHelper = jz.f17554a;
        }
        JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "set", this.f17314a.f18443k1);
        JsonExpressionParser.readExpression(parsingContext, jSONObject, "value_type", jz.f17554a, w9.f18845t);
        return new zf();
    }
}
