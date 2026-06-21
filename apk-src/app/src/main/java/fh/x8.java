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
public final class x8 implements Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sy f18994a;

    public x8(sy syVar) {
        this.f18994a = syVar;
    }

    @Override // com.yandex.div.serialization.Deserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final w8 deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "background_color", TypeHelpersKt.TYPE_HELPER_COLOR, ParsingConvertersKt.STRING_TO_COLOR_INT);
        sy syVar = this.f18994a;
        if (((cd) JsonPropertyParser.readOptional(parsingContext, jSONObject, "radius", syVar.f18554v3)) == null) {
            int i = a9.f16800a;
        }
        return new w8();
    }
}
