package fh;

import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class bn implements Deserializer {
    public static an a(ParsingContext parsingContext, JSONObject jSONObject) {
        TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
        Function1<Number, Long> function1 = ParsingConvertersKt.NUMBER_TO_INT;
        JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "duration", typeHelper, function1, en.f17160h, en.f17153a);
        JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "interpolator", en.f17159g, v0.f18737z, en.f17154b);
        TypeHelper<Double> typeHelper2 = TypeHelpersKt.TYPE_HELPER_DOUBLE;
        Function1<Number, Double> function12 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
        JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "pivot_x", typeHelper2, function12, en.i, en.f17155c);
        JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "pivot_y", typeHelper2, function12, en.f17161j, en.f17156d);
        JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "scale", typeHelper2, function12, en.f17162k, en.f17157e);
        JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "start_delay", typeHelper, function1, en.f17163l, en.f17158f);
        return new an();
    }

    @Override // com.yandex.div.serialization.Deserializer
    public final /* bridge */ /* synthetic */ Object deserialize(ParsingContext parsingContext, Object obj) {
        return a(parsingContext, (JSONObject) obj);
    }
}
