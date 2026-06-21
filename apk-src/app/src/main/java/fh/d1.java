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
public final class d1 implements Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sy f17047a;

    public d1(sy syVar) {
        this.f17047a = syVar;
    }

    @Override // com.yandex.div.serialization.Deserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final nc.e deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "direction", g1.f17251a, v0.f18736y);
        TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
        Function1<Number, Long> function1 = ParsingConvertersKt.NUMBER_TO_INT;
        JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "duration", typeHelper, function1, g1.f17253c);
        sy syVar = this.f17047a;
        ij.p pVar = syVar.X8;
        JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "interpolator", g1.f17252b, v0.f18737z);
        JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "start_delay", typeHelper, function1, g1.f17254d);
        return new nc.e();
    }
}
