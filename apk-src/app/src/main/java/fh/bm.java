package fh;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.internal.template.Field;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class bm implements TemplateResolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sy f16948a;

    public bm(sy syVar) {
        this.f16948a = syVar;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final nl resolve(ParsingContext parsingContext, tm tmVar, JSONObject jSONObject) {
        Field field = tmVar.f18651a;
        sy syVar = this.f16948a;
        if (((ol) JsonFieldResolver.resolveOptional(parsingContext, field, jSONObject, "center_x", syVar.W5, syVar.U5)) == null) {
            zj zjVar = cm.f17031a;
        }
        if (((ol) JsonFieldResolver.resolveOptional(parsingContext, tmVar.f18652b, jSONObject, "center_y", syVar.W5, syVar.U5)) == null) {
            zj zjVar2 = cm.f17031a;
        }
        JsonFieldResolver.resolveOptionalList(parsingContext, tmVar.f18653c, jSONObject, "color_map", syVar.f18487o6, syVar.f18469m6, cm.f17032b);
        JsonFieldResolver.resolveOptionalExpressionList(parsingContext, tmVar.f18654d, jSONObject, "colors", TypeHelpersKt.TYPE_HELPER_COLOR, ParsingConvertersKt.STRING_TO_COLOR_INT, cm.f17031a);
        return new nl();
    }
}
