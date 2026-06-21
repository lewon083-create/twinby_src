package fh;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.internal.template.Field;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class iz implements TemplateResolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sy f17455a;

    public iz(sy syVar) {
        this.f17455a = syVar;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final zf resolve(ParsingContext parsingContext, kz kzVar, JSONObject jSONObject) {
        JsonFieldResolver.resolveExpression(parsingContext, kzVar.f17659a, jSONObject, "get", TypeHelpersKt.TYPE_HELPER_STRING);
        if (((String) JsonFieldResolver.resolveOptional(parsingContext, kzVar.f17661c, jSONObject, "new_value_variable_name")) == null) {
            TypeHelper typeHelper = jz.f17554a;
        }
        Field field = kzVar.f17662d;
        sy syVar = this.f17455a;
        JsonFieldResolver.resolveOptionalList(parsingContext, field, jSONObject, "set", syVar.f18464m1, syVar.f18443k1);
        JsonFieldResolver.resolveExpression(parsingContext, kzVar.f17663e, jSONObject, "value_type", jz.f17554a, w9.f18845t);
        return new zf();
    }
}
