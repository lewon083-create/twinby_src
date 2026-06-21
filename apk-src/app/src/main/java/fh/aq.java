package fh;

import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class aq implements Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sy f16849a;

    public aq(sy syVar) {
        this.f16849a = syVar;
    }

    @Override // com.yandex.div.serialization.Deserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final zp deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        if (((cd) JsonPropertyParser.readOptional(parsingContext, jSONObject, "item_spacing", this.f16849a.f18554v3)) == null) {
            Expression expression = dq.f17115a;
        }
        JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "max_visible_items", TypeHelpersKt.TYPE_HELPER_INT, ParsingConvertersKt.NUMBER_TO_INT, dq.f17116b, dq.f17115a);
        return new zp();
    }
}
