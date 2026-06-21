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
public final class rt implements Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sy f18261a;

    public rt(sy syVar) {
        this.f18261a = syVar;
    }

    @Override // com.yandex.div.serialization.Deserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final qt deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        JsonExpressionParser.readExpression(parsingContext, jSONObject, "color", TypeHelpersKt.TYPE_HELPER_COLOR, ParsingConvertersKt.STRING_TO_COLOR_INT);
        JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "density", TypeHelpersKt.TYPE_HELPER_DOUBLE, ParsingConvertersKt.NUMBER_TO_DOUBLE, ut.f18715d, ut.f18712a);
        TypeHelper<Boolean> typeHelper = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
        Function1<Object, Boolean> function1 = ParsingConvertersKt.ANY_TO_BOOLEAN;
        JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "is_animated", typeHelper, function1, ut.f18713b);
        JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "is_enabled", typeHelper, function1, ut.f18714c);
        return new qt();
    }
}
