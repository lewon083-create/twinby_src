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
public final class zl implements Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sy f19269a;

    public zl(sy syVar) {
        this.f19269a = syVar;
    }

    @Override // com.yandex.div.serialization.Deserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final nl deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        sy syVar = this.f19269a;
        ij.p pVar = syVar.U5;
        if (((ol) JsonPropertyParser.readOptional(parsingContext, jSONObject, "center_x", pVar)) == null) {
            zj zjVar = cm.f17031a;
        }
        if (((ol) JsonPropertyParser.readOptional(parsingContext, jSONObject, "center_y", pVar)) == null) {
            zj zjVar2 = cm.f17031a;
        }
        JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "color_map", syVar.f18469m6, cm.f17032b);
        JsonExpressionParser.readOptionalExpressionList(parsingContext, jSONObject, "colors", TypeHelpersKt.TYPE_HELPER_COLOR, ParsingConvertersKt.STRING_TO_COLOR_INT, cm.f17031a);
        return new nl();
    }
}
