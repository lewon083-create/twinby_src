package fh;

import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class vm implements Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sy f18785a;

    public vm(sy syVar) {
        this.f18785a = syVar;
    }

    @Override // com.yandex.div.serialization.Deserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final um deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "background_color", TypeHelpersKt.TYPE_HELPER_COLOR, ParsingConvertersKt.STRING_TO_COLOR_INT);
        sy syVar = this.f18785a;
        ij.p pVar = syVar.f18554v3;
        if (((cd) JsonPropertyParser.readOptional(parsingContext, jSONObject, "corner_radius", pVar)) == null) {
            int i = ym.f19157a;
        }
        if (((cd) JsonPropertyParser.readOptional(parsingContext, jSONObject, "item_height", pVar)) == null) {
            int i10 = ym.f19157a;
        }
        if (((cd) JsonPropertyParser.readOptional(parsingContext, jSONObject, "item_width", pVar)) == null) {
            int i11 = ym.f19157a;
        }
        return new um();
    }
}
