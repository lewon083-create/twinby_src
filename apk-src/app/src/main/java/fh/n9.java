package fh;

import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class n9 implements Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sy f17934a;

    public n9(sy syVar) {
        this.f17934a = syVar;
    }

    @Override // com.yandex.div.serialization.Deserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final l9 deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        sy syVar = this.f17934a;
        ij.p pVar = syVar.f18443k1;
        JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "cancel_actions", pVar);
        JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "direction", q9.f18154d, v0.f18736y, q9.f18151a);
        TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
        Function1<Number, Long> function1 = ParsingConvertersKt.NUMBER_TO_INT;
        JsonExpressionParser.readExpression(parsingContext, jSONObject, "duration", typeHelper, function1, q9.f18156f);
        JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "end_actions", pVar);
        TypeHelper<Integer> typeHelper2 = TypeHelpersKt.TYPE_HELPER_COLOR;
        Function1<Object, Integer> function12 = ParsingConvertersKt.STRING_TO_COLOR_INT;
        JsonExpressionParser.readExpression(parsingContext, jSONObject, "end_value", typeHelper2, function12);
        JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "interpolator", q9.f18155e, v0.f18737z, q9.f18152b);
        JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "start_delay", typeHelper, function1, q9.f18157g, q9.f18153c);
        JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "start_value", typeHelper2, function12);
        return new l9();
    }
}
