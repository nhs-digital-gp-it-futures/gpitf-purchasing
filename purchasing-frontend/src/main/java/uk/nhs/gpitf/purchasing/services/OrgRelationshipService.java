package uk.nhs.gpitf.purchasing.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import uk.nhs.gpitf.purchasing.entities.*;
import uk.nhs.gpitf.purchasing.repositories.*;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrgRelationshipService {

    @Autowired
    private OrgRelationshipRepository thisRepository;

    public List<OrgRelationship> getAll() {
        List<OrgRelationship> coll = new ArrayList<>();
        thisRepository.findAll().forEach(coll::add);
        return coll;
    }    

    public List<OrgRelationship> getAllByParentOrgAndRelationshipType(Organisation parentOrg, RelationshipType relationshipType) {
        List<OrgRelationship> coll = new ArrayList<>();
        thisRepository.findAllByParentOrgAndRelationshipType(parentOrg, relationshipType).forEach(coll::add);
        return coll;
    }    

    public List<OrgRelationship> getAllByChildOrgAndRelationshipType(Organisation childOrg, RelationshipType relationshipType) {
        List<OrgRelationship> coll = new ArrayList<>();
        thisRepository.findAllByChildOrgAndRelationshipType(childOrg, relationshipType).forEach(coll::add);
        return coll;
    }    

    /**
     * Returns Organisations for a parent Organisation via a relationship type ordered by Name and OrgCode
     * @param parentOrg
     * @param relationshipType
     */
    public List<Organisation> getOrganisationsByParentOrgAndRelationshipType(Organisation parentOrg, RelationshipType relationshipType) {
        List<Organisation> coll = new ArrayList<>();
        for (OrgRelationship orgRel : thisRepository.findAllByParentOrgAndRelationshipType(parentOrg, relationshipType)) {
        	coll.add(orgRel.getChildOrg());
        }
        coll.sort((object1, object2) -> (object1.getName()+object1.getOrgCode()).compareToIgnoreCase(object2.getName()+object2.getOrgCode()));
        return coll;
    }    

}
