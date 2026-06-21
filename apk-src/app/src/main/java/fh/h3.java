package fh;

import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import io.sentry.SentryEnvelopeItemHeader;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class h3 implements Deserializer {
    public static g3 a(ParsingContext parsingContext, JSONObject jSONObject) {
        JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "animated", TypeHelpersKt.TYPE_HELPER_BOOLEAN, ParsingConvertersKt.ANY_TO_BOOLEAN, k3.f17556a);
        JsonExpressionParser.readExpression(parsingContext, jSONObject, "id", TypeHelpersKt.TYPE_HELPER_STRING);
        TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
        Function1<Number, Long> function1 = ParsingConvertersKt.NUMBER_TO_INT;
        JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, SentryEnvelopeItemHeader.JsonKeys.ITEM_COUNT, typeHelper, function1, k3.f17557b);
        JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "offset", typeHelper, function1, k3.f17558c);
        JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "overflow", k3.f17560e, v0.f18725n, k3.f17559d);
        return new g3();
    }

    @Override // com.yandex.div.serialization.Deserializer
    public final /* bridge */ /* synthetic */ Object deserialize(ParsingContext parsingContext, Object obj) {
        return a(parsingContext, (JSONObject) obj);
    }
}
