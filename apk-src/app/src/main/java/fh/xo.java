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
public final class xo implements Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sy f19058a;

    public xo(sy syVar) {
        this.f19058a = syVar;
    }

    @Override // com.yandex.div.serialization.Deserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final wo deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
        Function1<Number, Long> function1 = ParsingConvertersKt.NUMBER_TO_INT;
        JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "duration", typeHelper, function1, ap.f16847g, ap.f16841a);
        JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "edge", ap.f16845e, hn.f17351q, ap.f16842b);
        JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "interpolator", ap.f16846f, v0.f18737z, ap.f16843c);
        JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "start_delay", typeHelper, function1, ap.f16848h, ap.f16844d);
        return new wo();
    }
}
