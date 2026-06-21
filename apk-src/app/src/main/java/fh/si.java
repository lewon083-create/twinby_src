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
public final class si implements Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sy f18313a;

    public si(sy syVar) {
        this.f18313a = syVar;
    }

    @Override // com.yandex.div.serialization.Deserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ri deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        sy syVar = this.f18313a;
        ij.p pVar = syVar.f18443k1;
        JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "cancel_actions", pVar);
        JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "direction", vi.f18780d, v0.f18736y, vi.f18777a);
        TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
        Function1<Number, Long> function1 = ParsingConvertersKt.NUMBER_TO_INT;
        JsonExpressionParser.readExpression(parsingContext, jSONObject, "duration", typeHelper, function1, vi.f18782f);
        JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "end_actions", pVar);
        TypeHelper<Double> typeHelper2 = TypeHelpersKt.TYPE_HELPER_DOUBLE;
        Function1<Number, Double> function12 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
        JsonExpressionParser.readExpression(parsingContext, jSONObject, "end_value", typeHelper2, function12);
        JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "interpolator", vi.f18781e, v0.f18737z, vi.f18778b);
        JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "start_delay", typeHelper, function1, vi.f18783g, vi.f18779c);
        JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "start_value", typeHelper2, function12);
        return new ri();
    }
}
