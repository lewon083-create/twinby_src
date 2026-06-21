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
public final class z8 implements TemplateResolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sy f19205a;

    public z8(sy syVar) {
        this.f19205a = syVar;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final w8 resolve(ParsingContext parsingContext, b9 b9Var, JSONObject jSONObject) {
        JsonFieldResolver.resolveOptionalExpression(parsingContext, b9Var.f16905a, jSONObject, "background_color", TypeHelpersKt.TYPE_HELPER_COLOR, ParsingConvertersKt.STRING_TO_COLOR_INT);
        Field field = b9Var.f16906b;
        sy syVar = this.f19205a;
        if (((cd) JsonFieldResolver.resolveOptional(parsingContext, field, jSONObject, "radius", syVar.f18575x3, syVar.f18554v3)) == null) {
            int i = a9.f16800a;
        }
        return new w8();
    }
}
