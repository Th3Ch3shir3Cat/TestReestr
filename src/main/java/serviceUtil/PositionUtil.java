package serviceUtil;

import com.liferay.docs.servicebuilder.NoSuchBankException;
import com.liferay.docs.servicebuilder.NoSuchPositionException;
import com.liferay.docs.servicebuilder.service.PositionLocalServiceUtil;
import com.liferay.portal.kernel.exception.SystemException;
import view.Position;

public class PositionUtil {

    public static Position getPositionFromDatabase(Long positionId) throws SystemException, NoSuchBankException, NoSuchPositionException {
        com.liferay.docs.servicebuilder.model.Position positionFromDatebase =
                PositionLocalServiceUtil.findById(positionId);
        if(positionFromDatebase != null) {
            Position position = new Position();
            position.setPositionId(positionFromDatebase.getPositionId());
            position.setName(positionFromDatebase.getName());
            position.setArchived(positionFromDatebase.getArchived());
            return position;
        }
        return null;
    }
}
