package com.example.snehaladminservice.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.snehaladminservice.model.Branch;
@Repository
public interface BranchDao extends JpaRepository<Branch,String> {

	
	
	@Query("select b from Branch b where b.branch_id=?1")
	
	public void deleteBranch(String branch_id);
	//public List<Branch> showAll();
//	public Branch addBranch(Branch branch);
	//public String  deleteBranch(String branch_id);
	

	
}
